

import java.util.Scanner;

public class Main {
  static void qp(int n) {
    for(int i = 1; i <= n ; i++) {
      for(int j = n; j > i; j--) {
        System.out.print(" ");
      }
      for(int j = 0; j < (i - 1) * 2 + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    qp(n);
  }
}
