public class Task3 {
    public static void main(String[] args) {
        int a = 120;
        System.out.println(a += 1); // 121
        System.out.println(a *= 2); // 242
        System.out.println(a -= 1); // 241
        System.out.println(a /= 7); // 34
        System.out.println(a %= 6); // 4
        System.out.println(a != 4); // false
        System.out.println(a != 5); // true

        System.out.println((a > 5 ? 1 : 0)); // 0
        System.out.println((a > 3 ? 1 : 0)); // 1

        boolean t = true;
        boolean f = false;

        // логические операции
        System.out.println(t || f); // true
        System.out.println(f || false); // false
        System.out.println(t && f); // false
        System.out.println(t && true); // true
        System.out.println(a == 4); // true

        System.out.println(a > 3); // true
        System.out.println(a >= 4); // true
        System.out.println(a < 4); // false
        System.out.println(a <= 4); // true
        

        // побитовые операции
        int x = 12; // 1100
        int y = 10; // 1010
        System.out.println(x | y); // 14 (1110)
        System.out.println(x ^ y); // 6  (0110)
        System.out.println(x & y); // 8  (1000)
        System.out.println(~x); // -13
        System.out.println(x << 2); // 48 (1100 << 2 = 110000)
        System.out.println(x >> 1); // 6  (1100 >> 1 = 110)

        int neg = -8; // 11111111 11111111 11111111 11111000
        System.out.println(neg >> 2); // -2
        System.out.println(neg >>> 2); // 1073741822


        // обычные операции
        int p = 20, q = 7;
        System.out.println(p + q); // 27
        System.out.println(p - q); // 13
        System.out.println(p * q); // 140
        System.out.println(p / q); // 2 (целочисленное деление)
        System.out.println(p % q); // 6
        System.out.println((p + q) * 2); // 54 (изменение приоритета скобками)

        // инкремент и декремент
        int count = 5;
        System.out.println(count++); // 5 (постфикс: сначала выводим, потом увеличиваем)
        System.out.println(count);   // 6
        System.out.println(++count); // 7 (префикс: сначала увеличиваем, потом выводим)
        System.out.println(count--); // 7
        System.out.println(count);   // 6
        System.out.println(--count); // 5

        // !
        System.out.println(!t); // false
        System.out.println(!f); // true

        // индексация массива
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[0]); // 1
        System.out.println(arr[arr.length - 1]); // 5

        // String
        String s1 = "Hello";
        String s2 = "World";
        String s3;

        // присваивание ссылки
        s3 = s1;
        System.out.println(s3); // Hello

        // конкатенация
        System.out.println(s1 + " " + s2); // Hello World

        // конкатенация с присваиванием
        s3 += "!";
        System.out.println(s3); // Hello!



        // instanceof
        System.out.println(("ddfsdf" instanceof String)); //true
        System.out.println((null instanceof String)); //false, null instamceof "любой тип" всегда false
        

        
    }
}
