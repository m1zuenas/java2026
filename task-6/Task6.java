public class Task6 {
    public static void main(String[] args) {
        byte b = 3;
        short s = 1;
        int i = 2;
        char c = 'C';
        String str = "Java";

        switch(b){
            case 1:
                System.out.println("byte: 1");
                break;
            case 2:
                System.out.println("byte: 2");
                break;
            default:
                System.out.println("byte: >2");
        }

        switch(s){
            case 1:
                System.out.println("short: 1");
                break;
            case 2:
                System.out.println("short: 2");
                break;
            default:
                System.out.println("short: >2");
        }

        switch(i){
            case 1:
                System.out.println("int: 1");
                break;
            case 2:
                System.out.println("int: 2");
                break;
            default:
                System.out.println("int: >2");
        }

        switch(c){
            case 'A':
                System.out.println("char: A");
                break;
            case 'B':
                System.out.println("char: B");
                break;
            case 'C':
                System.out.println("char: C");
                break;
            default:
                System.out.println("Who knows");
        }

        switch(str){
            case "C":
                System.out.println("It's C");
                break;
            case "C++":
                System.out.println("It's C++");
                break;
            case "C#":
                System.out.println("It's C#");
                break;
            case "Java":
                System.out.println("Nice, it's Java!");
                break;
            default:
                System.out.println("Something else");
        }
    }
}
