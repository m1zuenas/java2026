public class Task15{
    public static void main(String[] args) {
        
        for(Days day : Days.values()){
             // выведет все варианты из перечисления через статический метод класса DayTracker
            DayTracker.getDay(day); 
        }

    }
}




enum Days{ // перечисление
    MONDAY("понедельник, рабочий день"), 
    TUESDAY("вторник, рабочий день"), 
    WEDNESDAY("среда, рабочий день"),
    THURSDAY("четверг, рабочий день"), 
    FRIDAY("пятница, рабочий день"), 
    SATURDAY("суббота, выходной"), 
    SUNDAY("воскресенье, выходной");

    final private String message;

    public String getMessage() { // геттер для message 
        return message;
    }

    private Days(String message) { // инициализация элементов перечисления
        this.message = message;
    }
}


class DayTracker{
    public static void getDay(Days day){
        System.out.println("Сегодня " + day.getMessage()); // класс, использующий метод перечисления 
    }
}
