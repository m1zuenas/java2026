

public class Task32 {
    public static void main(String args[]){
    try {
        int a = 10;
        int b = 0;
        int c = a / b;
    } catch (ArithmeticException e) {
        System.out.println("Арифметическая ошибка");
    }

    try{
        int arr[] = {1, 2, 3};
        int el = arr[3];
    }catch(IndexOutOfBoundsException e){
        System.out.println("Индекс вне массива");
    }


    try{
        testAge(-2);
    }catch(IllegalArgumentException e){
        System.out.println("Возраст не может быть меньше 0");
    }


    try{
        Object str = "abc";
        Integer some_int = (Integer)str;
    }catch(ClassCastException e){
        System.out.println("Ошибка приведения типов класса");
    }

    
    try{
        Object obj = null;
        obj.toString();
    }catch(NullPointerException e){
        System.out.println("Использование null-указателя");
    }



}



    private static void testAge(int age) throws IllegalArgumentException{
        if(age < 0){
            throw new IllegalArgumentException();
        }
        else{
            System.out.println("Всё нормально");
        }
    }
}
