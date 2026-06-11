public class Task35 {
    public static void main(String args[]){
        
    }
}



class MyException extends Exception{
    public MyException(){ super(); } // базовый конструктор
    public MyException(String msg){ super("My exception: " + msg); } // конструктор с сообщением
    public MyException(String msg, Throwable cause){ super("My exception: " + msg, cause); } // с сообщением и причиной
}
