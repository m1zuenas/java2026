public class Task25 {
    public static void main(String[] args) {

        // Вызов статического метода вложенного класса интерфейса
        MyInterface.NestedClass.printStaticMessage();

        // Создание объекта вложенного класса интерфейса
        MyInterface.NestedClass obj = new MyInterface.NestedClass();
        obj.printMessage();
    }
}


interface MyInterface{

    // Вложенный класс в интерфейсе:
    // по аналогии с вложенным (static) классом в обычном классе,
    // он не связан с экземпляром интерфейса и фактически является static
    class NestedClass{

        public void printMessage(){
            System.out.println("Обычный метод вложенного класса интерфейса");
        }

        public static void printStaticMessage(){
            System.out.println("Статический метод вложенного класса интерфейса");
        }
    }
}


