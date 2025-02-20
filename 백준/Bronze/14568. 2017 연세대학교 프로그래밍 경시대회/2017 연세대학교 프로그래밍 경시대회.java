import java.util.*;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cnt = 0;
    for(int i = 1; i < n; i++) { // 영훈
      for(int j = 1; j < n; j++) { // 택희
        for(int k = 1; k < n; k++) { // 남규
          if (k - i >= 2 && (j & 1) == 0 && i + j + k == n) {
            cnt++;
          }
        }
      }
    }
    System.out.println(cnt);
  }
}
