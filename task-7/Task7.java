public class Task7 {
    public static void main(String[] args) {
        int i = 0;
        // с break
        while(true){
            if(i > 10){
                break;
            }
            else{
                i++;
            }
        }

        // continue
        i = 0;
        while(i < 10){
            if(i == 5){
                i++;
                continue;
            }else{
                System.out.println(" " + i);
                i++;
            }
        }
    }
}
