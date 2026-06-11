
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class Task36 {
    public static void main(String args[]){
        // демонстрация работы InputStream и метода read
        byte byte_sequence[] = {3, 4, 33, 'd', 'f', ']', 127};


        ByteArrayInputStream in_stream = new ByteArrayInputStream(byte_sequence);

        int b;
        while((b = in_stream.read()) != -1){ // пока поток доступен
            System.out.println(b); // печатаем из потока
        }

        // демонстрация работы OutputStream и метода write(int)
        byte output_bytes[];

        ByteArrayOutputStream out_stream = new ByteArrayOutputStream();
        int source[] = {0, 1, 1, 2, 3, 5, 8, 13};

        for(int i: source){
            out_stream.write(i); // записываем массив int в поток
        }
        output_bytes = out_stream.toByteArray(); // возвращаем из потока последовательность byte 


        for(byte i: output_bytes){
            System.out.print(i + " ");
        }


        // демонстрация AutoCloseable
        try(MyResource resource = new MyResource()){
            System.out.println("\nWork..."); // close вызовется автоматически после Work... и выведет в консоль Closed
        }
    }
}



class MyResource implements AutoCloseable{
    @Override
    public void close(){
        System.out.println("Closed");
    }
}
