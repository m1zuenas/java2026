import java.util.Date;
public class Task31 {
    public static void main(String args[]){
        System.out.printf("Bool: %b\n", true);
        System.out.printf("Hash: %h\n", "string");
        System.out.printf("Exponential: %e\n", 4234.321);
        System.out.printf("Decimal: %d\n", 5);
        System.out.printf("String: %s\n\n", "string");

        Date date = new Date();
        System.out.printf("День недели: %tA\nДата: %td %tB\nВремя: %tH:%tM", date, date, date, date, date);
    }
}
