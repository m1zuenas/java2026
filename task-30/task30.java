public class Task30 {
    public static void main(String args[]){
        StringBuilder str = new StringBuilder(); // StringBuilder и StringBuffer имеют одинаковые методы
        // , но Builder быстрее, а Buffer потокобезопасен


        str.append("Hello!"); // основной метод, присоеденяет строку
        System.out.println(str);
        str.insert(5, " World"); // вставляет элемент в заданую позицию 
        // (то что правее сдвигает вправо)
        System.out.println(str);

        System.out.println(str.charAt(4)); // аналогично string, возвращает символ на заданной позиции

        str.deleteCharAt(5); // удаляет символ на заданном месте
        System.out.println(str);
        System.out.println(str.length()); // возвращает длину строки
        System.out.println(str.capacity()); // возвращает вместимость
        str.ensureCapacity(100); // задаёт минимальную вместимость, чтобы избежать перевыделений
        str.trimToSize(); // сбавляет вместимость до длины
        System.out.println(str.reverse()); // разворачивает строку
        String string = str.toString(); // возвращает аналогичный String
        System.out.println(string);

        StringBuffer str_buffer = new StringBuffer(string);
        System.out.println(str_buffer);
        System.out.println(new StringBuilder(str_buffer.toString()));
        // в String можно превратить методом toString. 
        // StringBuffer из StringBuilder и наоборот через 
        // промежуточный String (есть конструктор от String)
    }

}
