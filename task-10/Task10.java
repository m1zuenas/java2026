public class Task10 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat(); 

        animal.makeSound(); // методы одинаковые по названию
        cat.makeSound();    // но для объекта подкласса Cat метод переопределён, звук будет другим
        
        animal.makeSound(2); // перегрузка для методов обоих классов
        cat.makeSound(2);    // принимая новый параметр, они немного изменяют свой функционал
        // выведут "звук" по 2 раза
    }


}



class Animal{
    public void makeSound(){ // наш основной метод
        System.out.println("Animal sound...");
    }


    public void makeSound(int count){   // перегруженный метод: дополнительно принимается 
        for(int i = 0; i < count; i++){ // количество раз издавания звука
            System.out.println("Animal sound...");
        }
    } 
}


class Cat extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Meow!"); // переопределённый метод - кошка издаёт конкретный звук
    }

    @Override
    public void makeSound(int count){ // ещё один аналогично переопределённый метод
        for(int i = 0; i < count; i++){ 
            System.out.println("Meow!");
        }
    }
}

