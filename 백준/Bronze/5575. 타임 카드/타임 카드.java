
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 3; ++i) {
      int hcome = sc.nextInt();
      int mcome = sc.nextInt();
      int scome = sc.nextInt();
      int hout = sc.nextInt();
      int mout = sc.nextInt();
      int sout = sc.nextInt();

      int s = sout - scome;
      if (s < 0) {
        s += 60;
        mout -= 1;
      }

      int m = mout - mcome;
      if (m < 0) {
        m += 60;
        hout -= 1;
      }

      int h = hout - hcome;

      System.out.println(h + " " + m + " " + s);
    }

  }
}
