import java.io.BufferedReader;

public class p28 {
  public static void main(String[] args) throws IOException {
    System.out.println("請輸入一個整數");
    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

    String str1 = br1.readLine();

    int cat = Integer.parseInt(str1);

    System.out.println("你輸入的數字是 :  " + cat);
    System.out.println("請輸入字串");

    BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

    String str2 = br2.readLine();

    System.out.println("剛輸入的字串是:" + str2);

  }
}