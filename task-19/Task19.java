public class Task19 {
    public static void main(String[] args) {
        // пример перегрузки
        int i_a = 1;
        int i_b = 2;

        double d_a = 1.0;
        double d_b = 2.0;
        
        // разный результат вывода в консоль, так как разные типы данных (соответственно разные реализации)
        OverloadExample.printSum(d_a, d_b);
        OverloadExample.printSum(i_a, i_b);


        // пример переопределения
        Animal animal = new Animal();
        Animal cat = new Cat();

        // вызываются разные реализации методов
        animal.makeSound();  
        cat.makeSound(); 
    }
}


class OverloadExample{

    public static void printSum(double a, double b){
        System.out.println("\nСумма двух double равна " + (a + b));
    }


    public static void printSum(int a, int b){
        System.out.println("\nСумма двух int равна " + (a + b));
    }
}


// пример переопределения
class Animal{
    public void makeSound(){
        System.out.println("Any sound...");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Meow!");
    }
}
