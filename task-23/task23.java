public class Task23 {
    public static void main(String[] args) {
        
        Outer23 outer = new Outer23(10, 20, 30, 40);
        Outer23.Inner inner = outer.new Inner();

        inner.printAllFields();
        inner.callAllMethods();
    }
}


class Outer23{
    public int publicField;
    protected int protectedField;
    int defaultField;
    private int privateField;

    public Outer23(int publicField, int protectedField, int defaultField, int privateField) {
        this.publicField = publicField;
        this.protectedField = protectedField;
        this.defaultField = defaultField;
        this.privateField = privateField;
    }


    public void publicMethod(){
        System.out.println("Вызван public метод внешнего класса");
    }

    protected void protectedMethod(){
        System.out.println("Вызван protected метод внешнего класса");
    }

    void defaultMethod(){
        System.out.println("Вызван метод без спецификатора доступа внешнего класса");
    }

    private void privateMethod(){
        System.out.println("Вызван private метод внешнего класса");
    }


    class Inner{

        public void printAllFields(){
            // внутренний класс имеет доступ ко всем полям внешнего класса,
            // в том числе к private
            System.out.println(publicField);
            System.out.println(protectedField);
            System.out.println(defaultField);
            System.out.println(privateField);
        }

        public void callAllMethods(){
            // внутренний класс имеет доступ ко всем методам внешнего класса,
            // в том числе к private
            publicMethod();
            protectedMethod();
            defaultMethod();
            privateMethod();
        }
    }
}
