public class Task20 {
    public static void main(String[] args) {
        Example ex1 = new Example(1, 2);
        Example ex2 = new Example(1, 2);
        System.out.println(ex1.equals(ex2)); // true

        Example ex3 = new Example(2, 1);
        System.out.println(ex1.equals(ex3)); // false
    }
}


class Example{
    public int param1;
    public int param2;

    

    public Example(int param1, int param2) {
        this.param1 = param1;
        this.param2 = param2;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null) return false;
        if(!(obj instanceof Example)) return false;

        Example other = (Example)obj;
        return (other.param1 == this.param1) && (other.param2 == this.param2);
    }
}


