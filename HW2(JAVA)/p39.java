public class p39 {
  public static void main(String[] args) {
    int d = 2;
    double pi = 3.14;

    System.out.println("直徑是"+d+"公分的圓");
    System.out.println("他的圓周長為" +(pi*d)+"公分");

    int num1 = 5,num2 = 4;
    double dd = num1/num2;
    double ddd = (double)num1/(double)num2;

    System.out.println("(int/int)5/4 = "+dd);
    System.out.println("(double/double)5/4 = "+ddd);    
  }
}