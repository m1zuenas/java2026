public class Task34 {
    public static void main(String args[]){
        try {
            ExceptionTest.giveExceptionDiff(Math.random());
        } catch (IllegalArgumentException | ArithmeticException e) { // обрабатываются два типа исключений
            System.out.println("Поймано исключение");
        }



        try{
            ExceptionTest.giveExceptionTree(); // обрабатывается иерархия исключений
        }catch(Ex3 e){ // порядок важен, так как иначе Ex1 сможет поймать и Ex2 и Ex3 само.
            System.out.println("Поймано исключение 3");
        }catch(Ex2 e){
            System.out.println("Поймано исключение 2");
        }catch(Ex1 e){
            System.out.println("Поймано исключение 1");
        }
    }
}



interface ExceptionTest{
    static void giveExceptionDiff(double a) throws IllegalArgumentException, ArithmeticException{ 
        // кидает одно из двух исключений
        if(a > 0.5){
            throw new IllegalArgumentException();
        }else{
            throw new ArithmeticException();
        }
    }


    static void giveExceptionTree() throws Ex1, Ex2, Ex3{
        int x = (int)(Math.random() * 3);
        // кидает исключения, связанные наследованием
        switch (x) {
            case 0 -> throw new Ex1("Ex 1");
            case 1 -> throw new Ex2("Ex 2");
            case 2 -> throw new Ex3("Ex 3");
            default -> throw new AssertionError();
        }
    }
}




class Ex1 extends Exception{
    public Ex1(String msg){
        super(msg);
    }
}

class Ex2 extends Ex1{
    public Ex2(String msg){
        super(msg);
    }
}

class Ex3 extends Ex2{
    public Ex3(String msg){
        super(msg);
    }
}
