import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int m, n;
    for(int i = 0; i < t; ++i) {
      n = sc.nextInt();
      m = sc.nextInt();
      long cases = combination(m, n);
      System.out.println(cases);
    }
  }

  private static long combination(int n, int k) {
    if (k > n - k) {
      k = n - k;
    }
    long result = 1;
    for(int i = 0; i < k; ++i) {
      result *= (n - i);
      result /= (i + 1);
    }
    return result;
  }
}
