public class Task9 {
    public static void main(String[] args) {
        Summator test = new Summator(42);

        test.setData1(2);
        test.setData2("Java");
        test.setData3(0.26f);


        test.printData();
    }
}


class Summator{
    // для соблюдения инкапсуляции не будем делать поля класса не-private
    private int data1; 
    private String data2;
    private float data3;

    public void setData1(int data1) { // public метод, доступен всем другим классам
        this.data1 = data1;
    }

    protected void setData2(String data2) { // protected метод, в рамках одного пакета отличий от public нет
        this.data2 = data2;                 // но вне пакета он доступен только подклассам этого класса
    }

    void setData3(float data3) { // без спецификатора, package-private метод, доступен любому классу в этом пакете
        this.data3 = data3;      // не доступен вне этого пакета
    }

    
    private float sum(int data1, float data3){ // private метод, может быть вызван только внутри этого класса
        return data1 + data3;
    }

    public void printData(){
        System.out.println(data2 + " " + sum(data1, data3)); // public-метод, выводит строку и сумму чисел внутри объекта
    }


    public Summator(int a){
        data1 = a;
    }
}
