import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFilePractice {
    public static void main(String[] args) {
        // Указываем путь к файлу, который хотим прочитать
        File file = new File("test.txt");

        // Используем try-with-resources, чтобы Scanner сам закрылся после работы
        try (Scanner scanner = new Scanner(file)) {
            
            // Читаем файл, пока в нем есть следующие строки
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Ой, файл не найден! Проверьте название и путь.");
        }
    }
}
