import java.io.*;
import java.util.*;

public class HuffmanCoding {

    
    static class BitOutputStream {
        OutputStream out;
        int currentByte = 0;
        int numBitsFilled = 0;

        public BitOutputStream(OutputStream out) {
            this.out = out;
        }

        public void writeBit(boolean bit) throws IOException {
            currentByte <<= 1;
            if (bit) {
                currentByte |= 1;
            }
            ++numBitsFilled;

            if (numBitsFilled == 8) {
                out.write(currentByte);
                currentByte = 0;
                numBitsFilled = 0;
            }
        }

        public void flush() throws IOException {
            if (numBitsFilled == 0) {
                out.write(0);
            } else {
                currentByte <<= (8 - numBitsFilled);
                out.write(currentByte);
                currentByte = 0;
                numBitsFilled = 0;
        }
}
    }


    static class BitInputStream {
        InputStream in;
        int currentByte;
        int bitsRemaining;

        public BitInputStream(InputStream in) {
            this.in = in;
            this.bitsRemaining = 0;
        }

        public boolean readBit() throws IOException {
            if (bitsRemaining == 0) {
                int next = in.read();
                if (next == -1) {
                    throw new IOException("Unexpected end of stream while reading bits");
                }
                currentByte = next;
                bitsRemaining = 8;
            }
            boolean bit = ((currentByte >> (bitsRemaining - 1)) & 1) == 1;
            bitsRemaining--;
            return bit;
        }
    }


    static class HuffmanTree {
        private final Node root;

        public HuffmanTree(Map<Byte, Integer> frequencesMap) {
            PriorityQueue<Node> pq = new PriorityQueue<>();

            for (Map.Entry<Byte, Integer> entry : frequencesMap.entrySet()) {
                pq.add(new Node(entry.getKey(), entry.getValue()));
            }

            while (pq.size() > 1) {
                Node first = pq.poll();
                Node second = pq.poll();

                Node newNode = new Node(null, first.frequency + second.frequency);
                newNode.left = first;
                newNode.right = second;
                pq.add(newNode);
            }

            root = pq.poll();
        }

        private void buildCodeTableRecursive(Node node, String currentCode, Map<Byte, String> codeTable) {
            if (node == null) {
                return;
            }
            if (node.isLeaf()) {
                codeTable.put(node.value, currentCode);
                return;
            }
            buildCodeTableRecursive(node.left, currentCode + "0", codeTable);
            buildCodeTableRecursive(node.right, currentCode + "1", codeTable);
        }

        public Map<Byte, String> buildCodeTable() {
            Map<Byte, String> codeTable = new HashMap<>();
            buildCodeTableRecursive(root, "", codeTable);
            return codeTable;
        }


        public byte decodeNextSymbol(BitInputStream bitIn) throws IOException {
            Node node = root;
            while (!node.isLeaf()) {
                boolean bit = bitIn.readBit();
                if (bit) {
                    node = node.right;
                } else {
                    node = node.left;
                }
            }
            return node.value;
        }

        private static class Node implements Comparable<Node> {
            Byte value;
            int frequency;
            Node left;
            Node right;

            public Node(Byte value, int frequency) {
                this.value = value;
                this.frequency = frequency;
            }

            boolean isLeaf() {
                return left == null && right == null;
            }

            @Override
            public int compareTo(Node other) {
                return Integer.compare(this.frequency, other.frequency);
            }
        }
    }

  
    public static void encode(InputStream input, OutputStream output) throws IOException {
        Map<Byte, Integer> counter = new HashMap<>();
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();

        int cur;
        while ((cur = input.read()) != -1) {
            byteStream.write(cur);
        }

        byte[] data = byteStream.toByteArray();

        for (byte current : data) {
            counter.compute(current, (key, value) -> {
                if (value == null) {
                    return 1;
                } else {
                    return value + 1;
                }
            });
        }

        Map<Byte, String> codeTable = new HuffmanTree(counter).buildCodeTable();

        DataOutputStream out = new DataOutputStream(output);
        out.writeInt(data.length);
        out.writeInt(counter.size());
        for (Map.Entry<Byte, Integer> entry : counter.entrySet()) {
            out.writeByte(entry.getKey());
            out.writeInt(entry.getValue());
        }

        BitOutputStream bitStream = new BitOutputStream(out);

        for (byte curByte : data) {
            String code = codeTable.get(curByte);
            for (int i = 0; i < code.length(); ++i) {
                bitStream.writeBit(code.charAt(i) == '1');
            }
        }
        bitStream.flush();
    }


    public static void decode(InputStream input, OutputStream output) throws IOException {
        DataInputStream in = new DataInputStream(input);

        int dataLength = in.readInt();
        int tableSize = in.readInt();

        Map<Byte, Integer> counter = new HashMap<>();
        for (int i = 0; i < tableSize; i++) {
            byte key = in.readByte();
            int freq = in.readInt();
            counter.put(key, freq);
        }

        HuffmanTree tree = new HuffmanTree(counter);
        BitInputStream bitIn = new BitInputStream(in);

        for (int i = 0; i < dataLength; i++) {
            byte symbol = tree.decodeNextSymbol(bitIn);
            output.write(symbol);
        }
    }

    
    public static void main(String[] args) {
        if (args.length < 3) {
            System.err.println("Использование:");
            System.err.println("  кодирование:   java HuffmanCoding encode <входной_файл> <выходной_файл>");
            System.err.println("  декодирование: java HuffmanCoding decode <входной_файл> <выходной_файл>");
            System.exit(1);
        }

        String command = args[0];
        String inputFile = args[1];
        String outputFile = args[2];

        try (InputStream in = new FileInputStream(inputFile);
             OutputStream out = new FileOutputStream(outputFile)) {

            if ("encode".equalsIgnoreCase(command)) {
                encode(in, out);
                System.out.println("Файл успешно закодирован.");
            } else if ("decode".equalsIgnoreCase(command)) {
                decode(in, out);
                System.out.println("Файл успешно декодирован.");
            } else {
                System.err.println("Неизвестная команда: " + command + ". Используйте 'encode' или 'decode'.");
                System.exit(1);
            }

        } catch (IOException e) {
            System.err.println("Ошибка ввода-вывода: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
