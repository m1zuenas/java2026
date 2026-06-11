import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int a1[] = {1, 4, 6, 13, 22};
        int a2[] = {1, 4, 6, 13, 21};
        int a3[] = {22, 3, 43, -12, 4};
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.binarySearch(a2, 6)); // находит индекс 2 (элемент 6)
        System.out.println(Arrays.equals(a1, a2)); // false, не равны поэлементно
        System.out.println(Arrays.compare(a1, a2)); // первый "больше", положительное число
        Arrays.sort(a3);
        System.out.println(Arrays.toString(a3)); // выводит уже отсортированный массив a3
    }
}
