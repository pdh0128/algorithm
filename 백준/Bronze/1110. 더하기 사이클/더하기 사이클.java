import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n_s = sc.nextLine();
    String copy_n = n_s;
    int n = Integer.parseInt(n_s);
    if (n < 10) copy_n = "0" + n;
    int cnt = 0;
    int nn = -1;
    String temp;
    do {
      if (n < 10) n_s = "0" + n;
      else n_s = "" + n;
      nn = (n / 10 + n % 10);
      temp = n_s.charAt(1) + "" + nn % 10;
      n = Integer.parseInt(temp);
      ++cnt;
    } while(!copy_n.equals(temp));
    System.out.println(cnt);
  }
}
