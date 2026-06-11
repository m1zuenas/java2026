public class Task27 {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom");
        
        BasicAnimalActions.describeActions();

        cat.eat();
        cat.sleep(5);
        cat.makeSound();
    }
}


interface BasicAnimalActions{
    static void describeActions(){
        System.out.println("Basic actions are: eat, sleep, make sound");
    } 

    default void eat(){
        System.out.println("The animal has eaten ");
    }

    default void sleep(int hours){
        System.out.println("The animal has slept for " + hours + " hours ");
    }

    void makeSound();
}

class Cat implements BasicAnimalActions{
    String name;

    Cat(String name){
        this.name = name;
    }

    @Override
    public void makeSound(){
        System.out.println("Meow! ");
    }
}
