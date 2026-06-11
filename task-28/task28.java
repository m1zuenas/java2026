public class Task28 {
    public static void main(String[] args) {
        Example ex = new Example();
        ex.method(); // выведет "Default method 1" 
    }
}


interface Interface1{
    default void method(){
        System.out.println("Default method 1");
    }
}

interface Interface2{
    default void method(){
        System.out.println("Default method 2");
    }
}


class Example implements Interface1, Interface2{
    @Override
    public void method(){
        Interface1.super.method(); // решили конфликт в пользу реализации из интерфейса 1
    }
}
