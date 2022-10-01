public class p34 {
  public static void main(String[] args) {

    int cat1 = 10, cat2 = 5;

    System.out.println("變數cat1、cat2的各種運算: ");
    System.out.println("cat1+cat2 = " + (cat1 + cat2));
    System.out.println("cat1-cat2 = " + (cat1 - cat2));
    System.out.println("cat1*cat2 = " + (cat1 * cat2));
    System.out.println("cat1/cat2 = " + (cat1 / cat2));
    System.out.println("cat1%cat2 = " + (cat1 % cat2));

    int a = 0, b = 0, c = 0;
    b = a++;
    c = ++a;

    System.out.println("因為是在指定值之後才遞增，所以B的值為 " + b);
    System.out.println("因為是在遞增之後才指定值，所以C的值為 " + c);
  }
}