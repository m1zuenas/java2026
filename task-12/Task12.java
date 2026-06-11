public class Task12 {
    public static void main(String[] args) {
        Ab test1 = new Ab(); // будет инициализированно конструктором и станет = 23



        int value = 42;

        Ab test2 = new Ab(value); // a будет инициализированно числом value = 42

        System.out.println(test1.a);
        System.out.println(test2.a);
    }
}

class Ab{ // по неизвестным причинам код отказывался работать с названием A
    public final int a; // можно инициализировать сразу

    public Ab(){
        a = 23;
    }

    public Ab(int a){
        this.a = a;
    }
}
