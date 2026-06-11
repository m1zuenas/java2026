public class Task22 {
    public static void main(String[] args) {
        
        Outer outer = new Outer();

        // доступны извне, потому что методы public
        outer.usePublicInner();
        outer.useProtectedInner();
        outer.useDefaultInner();
        outer.usePrivateInner();

        // public внутренний класс можно создать извне через объект внешнего класса
        Outer.PublicInner publicInner = outer.new PublicInner();
        publicInner.printInfo();

        // default / protected / private внутренние классы из другого файла обычно напрямую недоступны
        // поэтому для демонстрации используются методы внешнего класса
    }
}


class Outer{

    public class PublicInner{
        public void printInfo(){
            System.out.println("Это public inner class");
        }
    }


    protected class ProtectedInner{
        public void printInfo(){
            System.out.println("Это protected inner class");
        }
    }


    class DefaultInner{
        public void printInfo(){
            System.out.println("Это inner class без спецификатора доступа");
        }
    }


    private class PrivateInner{
        public void printInfo(){
            System.out.println("Это private inner class");
        }
    }


    public void usePublicInner(){
        PublicInner test = new PublicInner();
        test.printInfo();
    }

    public void useProtectedInner(){
        ProtectedInner test = new ProtectedInner();
        test.printInfo();
    }

    public void useDefaultInner(){
        DefaultInner test = new DefaultInner();
        test.printInfo();
    }

    public void usePrivateInner(){
        PrivateInner test = new PrivateInner();
        test.printInfo();
    }
}
