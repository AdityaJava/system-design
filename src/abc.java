/**
 * abc
 */
public class abc {

  public void a(int i, long l) {
    System.out.println("Method 1");
  }

  public void a(long l, int i) {
    System.out.println("Method 2");
  }

  public void a(double l, float i) {
    System.out.println("Method 3");
  }

  public void a(float l, double i) {
    System.out.println("Method 4");
  }

  public static void main(String[] args) {
    abc abc = new abc();
    abc.a(9, 10l);

    abc.a(9.0,10.0f);
  }
}
