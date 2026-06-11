public class Task24 {
    public static void main(String[] args) {
        
        Outer24 outer = new Outer24();
        outer.testInnerAccess();
    }
}


class Outer24{

    class Inner{
        public int publicField = 1;
        protected int protectedField = 2;
        int defaultField = 3;
        private int privateField = 4;


        public void publicMethod(){
            System.out.println("Вызван public метод внутреннего класса");
        }

        protected void protectedMethod(){
            System.out.println("Вызван protected метод внутреннего класса");
        }

        void defaultMethod(){
            System.out.println("Вызван метод без спецификатора доступа внутреннего класса");
        }

        private void privateMethod(){
            System.out.println("Вызван private метод внутреннего класса");
        }
    }


    public void testInnerAccess(){
        Inner inner = new Inner();

        // внешний класс имеет доступ ко всем полям внутреннего класса,
        // в том числе к private
        System.out.println(inner.publicField);
        System.out.println(inner.protectedField);
        System.out.println(inner.defaultField);
        System.out.println(inner.privateField);

        // внешний класс имеет доступ ко всем методам внутреннего класса,
        // в том числе к private
        inner.publicMethod();
        inner.protectedMethod();
        inner.defaultMethod();
        inner.privateMethod();
    }
}
