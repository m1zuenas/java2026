public class Task17 {
    public static void main(String[] args) {
        
        Dog dog = new Dog("Harry");

        dog.printThisNameAge(); // выведет 5 и Harry. Поле name есть только у родителя, разницы не будет. 
        // 5 выводится так как поле age у этого подкласса инициализировано значением 5

        dog.printSuperNameAge(); // выведет 10 и Harry. 10 выводится потому, что поле 
        // age у родителя инициализируется значением 10. Поля name у родителя и наследника 
        // фактически являются разными полями
        

        dog.makeBothSounds(); // пишет разный результат. Первым идёт не переопределённый метод из родительского класса
    }
}



class Animal{
    byte age = 10;
    String name = "Default";

    public Animal() {
        name = "Constructor default";
    }

    public Animal(String name){
        this.name = name;
    }

    

    public void makeSound(){
        System.out.println("Some sound...");
    }
}



class Dog extends Animal{
    byte age = 5;

    public Dog() {
        super(); // вызывается базовый конструктор родителя
    }

    public Dog(String name){
        super(name); // вызывается конструктор родителя с параметром String name
    } 

    @Override
    public void makeSound(){
        System.out.println("Woof!"); // перегруженный метод
    }


    public void printSuperNameAge(){ // выводит имя и возраст через поля родителя
        System.out.println(super.age);
        System.out.println(super.name);
    }

    public void printThisNameAge(){ // выводит имя и возраст через поля этого класса
        System.out.println(this.age);
        System.out.println(this.name);
    }

    public void makeBothSounds(){ // использует метод родителя и переопределённый метод этого класса
        super.makeSound();
        makeSound();
    }

    
}
