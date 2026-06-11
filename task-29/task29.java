import java.util.StringJoiner;

public class Task29 {
    public static void main(String args[]){
        String str1 = "This is a Java string";
        String str2 = "This is another Java string";

        System.out.println(str1.length()); // возвращает длину строки. Здесь 21 символ
        System.out.print(str1.charAt(3) + "\n"); // возвращает символ по индексу. Здесь 's'
        System.out.println(str1.isEmpty()); // проверяет, пустая ли строка. Здесь false
        System.out.print(str1.codePointAt(2) + "\n"); // возвращает Unicode-код символа по индексу. Здесь 105
        System.out.println(str1.equals(str2)); // сравнивает строки. Здесь false
        System.out.println(str1.compareTo(str2)); // лексиографическое сравнение. Здесь -78
        System.out.print(str1.lastIndexOf('i') + "\n"); // находит последнее вхождение символа в строку. Здесь 18
        System.out.print("Something".substring(4, 9) + "\n"); // возвращает подстроку. Здесь thing
        System.out.print("hahaha".replace('h', 'l') + "\n"); // заменяет заданные символы на другие. Здесь lalala
        
        String strs[] = "a, b, c".split(", "); // разделяет по заданному символу
        for(int i = 0; i < 3; i++){
            System.out.print(strs[i] + " \n"); // a b c
        }


        StringJoiner jnr = new StringJoiner(", ", "{", "}");

        jnr.add("One").add("two");
        jnr.add("three");
        System.out.println(jnr.toString());


        String textBlock = """
            Animals:
            Dog
            Cat
            Fish
            """;
    
        System.out.println(textBlock);
    }

   
    
    

}
