import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamPractice {
    public static void main(String[] args) {
        String filename = "practice_test.txt";

        // Практика #2 и #4 (запись + AutoCloseable)
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            fos.write(75); // Пишем один байт (код буквы K)
            System.out.println("Байт записан в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Практика #1 и #4 (чтение + AutoCloseable)
        try (FileInputStream fis = new FileInputStream(filename)) {
            int data = fis.read();
            System.out.println("Прочитали байт: " + data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
