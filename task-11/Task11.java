public class Task11 {
    public static void main(String[] args) {
        A.printVars(); // вызов через имя класса

        A test = new A();
        test.printVars(); // вызов через объект класса

        A.staticMethod();
        test.nonStaticMethod(); // проверка работы 
    }
}


class A { // убрал public, чтобы в одном файле было не больше 1 public класса
    public static int a = 1;
    public static int b; // автоматически инициализирован нулём

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void staticMethod(){
        printVars(); // внутренний вызов в статическом методе
    }

    public void nonStaticMethod(){
        printVars(); // внутренний вызов в нестатическом методе
    }
}
