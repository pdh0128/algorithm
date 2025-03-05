import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long[] padoban  = new long[101];
    padoban[0] = 0;
    padoban[1] = 1;
    padoban[2] = 1;
    for (int j = 3; j < padoban.length; ++j) {
      padoban[j] = padoban[j - 2] + padoban[j - 3];
//       System.out.println(padoban[j]);
    }

    int t = sc.nextInt();
    for(int i = 0; i < t; i++) {
      int n = sc.nextInt();
      System.out.println(padoban[n]);
    }

  }
}
