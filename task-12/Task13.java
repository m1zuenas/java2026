public class Task13 {
    public static void main(String[] args) {
        Wrapper<Double> a = new Wrapper<>();


        System.out.println(a instanceof Wrapper); 
        System.out.println(a instanceof Wrapper<Double>); // оба выводят true, не позволяет написать с Wrapper<Integer>


        Wrapper<? extends Animal> dogs = new Wrapper<Dog>(); // generic примет объекты класса Animal или наследников
        Wrapper<? super Dog> animals = new Wrapper<Animal>(); // generic примет объекты класса Dog или выше в иерархии
    }
}



class Wrapper<T>{
    private T data;

    public Wrapper() {
    }

    
    public Wrapper(T data) {
        this.data = data;
    }

    void setData(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }
}


class Animal{
    private final int age;


    public Animal(int age) {
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public void MakeSound(){
        System.out.println("Some noise...");
    }
}


class Dog extends Animal{

    public Dog(int age) {
        super(age);
    }


    @Override
    public void MakeSound(){
        System.out.println("Woof!");
    }
}


class Cat extends Animal{

    public Cat(int age) {
        super(age);
    }


    @Override
    public void MakeSound(){
        System.out.println("Meow!");
    }
}
