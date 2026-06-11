import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Task37 {
    public static void main(String args[]){
        ArrayList<String> string_list = new ArrayList<String>(); // динамический массив для хранения строк

        try(Scanner scanner = new Scanner(new File("data.txt"))){ // создаём через try-with-resources
            string_list.add(scanner.nextLine()); // читаем построчно
        }catch(Exception e){
            System.out.println("Произошла ошибка"); // обработчик всех ошибок
        }
    }
}
