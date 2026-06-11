public class Task18 {
    public static void main(String[] args) {

        A test = new A(1, 2, 3);
        test.printTest();
    }
}



class A {
  int a;
  int b;
  int c;
  int z;

  public A() {
    z = 1;
  }

  public A(int a) {
    this();
    this.a = a;
  }

  public A(int a, int b) {
    this(a);
    this.b = b;
  }

  public A(int a, int b, int c) {
    this(a, b);
    this.c = c;
  }


  public void printTest(){
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(z);
  }
}
