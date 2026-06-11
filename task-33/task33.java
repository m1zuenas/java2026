public class Task33 {
    public static void main(String args[]){
        int a = 10;
        int b = 0;

        try {
            int c = a / b; // вызывает ArithmeticException из-за деления на ноль    
        } catch (Exception e) {
            System.out.println("Поймано исключение");
            int c = 0;
        }

        int d = a / b; // то же самое ArithmeticException, не обрабатывается
        
    }
}
