public class Task16 {
    public static void main(String[] args) {
        
    }
}


class Animal{
    final public void makeSound(){
        System.out.println("Some sound...");
    }
}


class Dog extends Animal{
    @Override
    public void makeSound(){ // не скомпилируется, "Cannot override the final method from Animal"

    }
}

final class Human{
    byte age;
    String name;

    Human(String name, byte age){
        this.age = age;
        this.name = name;
    }
}


class Student extends Human{ // "cannot inherit from final Human"

}
