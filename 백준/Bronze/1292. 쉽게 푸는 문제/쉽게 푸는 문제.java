import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int sum = 0;
    int cnt = 0;
    for(int i = 1; cnt < m; ++i) {
      for(int j = 1; j <= i; ++j) {
        ++cnt;
        if (cnt >= n && cnt <= m) {
          sum += i;
        }
      }
    }
    System.out.println(sum);
  }
}
