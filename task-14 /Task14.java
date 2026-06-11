public class Task14 {
    public static void main(String[] args) {
        System.out.println(Summator.getSum(1, 2, 3, 10, 32, 3)); // выведет 51
        System.out.println(Summator.getSum(2.2, 3.56, 11.33, 67.52)); // выведет 84.61
    }
}





class Summator{
    // статический метод, суммирующий все введённые int
    public static Integer getSum(int... numbers){
        int sum = 0;

        for(int num: numbers){
            sum += num;
        }

        return sum; // автоупаковка в Integer
    }

    // статический метод, суммирующий все введённые double
    public static Double getSum(double... numbers){
        double sum = 0.0;

        for(double num: numbers){
            sum += num;
        }

        return sum; // автоупаковка в Double
    }
}
