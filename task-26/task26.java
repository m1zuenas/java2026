
import java.util.ArrayList;

public class Task26{
    public static void main(String args[]){
        Testable overEx = new OverrideExample();
        Testable deprEx = new DeprecatedExample();
        Testable supEx = new SupressWarningExample();

        overEx.test();
        deprEx.test();
        supEx.test();
    }
}


interface Testable{
    public void test(); 
}


class OverrideExample implements Testable{
    @Override
    public void test(){
        System.out.println("Overriden test"); // тест @Overriden, проверяет соответствие сигнатуры
    }
}

class DeprecatedExample implements Testable{
    @Deprecated
    private void oldMethod(){
        System.out.println("Deprecated method"); // тест @Depricated
    }

    private void newMethod(){
        System.out.println("New method");
    }


    @Override
    public void test(){
        oldMethod(); // в автозаполнении oldMethod() зачёркнут - не рекомендуется к использованию
        newMethod();
    }
}


class SupressWarningExample implements Testable{


    @Override
    public void test(){
        @SuppressWarnings("rawtypes")
        java.util.ArrayList list = new ArrayList(); // тест @SupressWarning. 
        // Здесь убирает предупреждение об отсутствии указания типа

        System.out.println("Supress warning test");
    }
}
