import java.lang.*;
public class Task4 {
    public static void main(String[] args) {
    // decode
    Integer decExample = Integer.decode("10"); // 10 в десятичной
    Integer decExampleOct = Integer.decode("012"); // 10 в восьмеричной
    Integer decExampleHex = Integer.decode("0XA"); // 10 в шестнадцетеричной

    System.out.println(decExample);
    System.out.println(decExampleOct);
    System.out.println(decExampleHex);

    // способы создания boolean
    Boolean t = Boolean.valueOf(true); // через примитивный тип
    Boolean f = Boolean.valueOf("false"); // парсинг строки
    Boolean t2 = true; // автоупаковка
    Boolean f2 = Boolean.FALSE; // через константу
    
    System.out.println(t);
    System.out.println(f);
    System.out.println(t2);
    System.out.println(f2);


    Integer n = null;
    int i = n; // вызывает исключение

    
    }
}
