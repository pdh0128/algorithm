import java.util.*;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    int len = n.length();
    int[] arr = new int[len];
    for(int i = 0; i < len; i++) {
      arr[i] = n.charAt(i) - '0';
    }

    solve(arr, len);
  }
  private static void solve(int[] arr, int len) {
    if (len != 1 ) {
      for (int start = 0; start < len; start++) {
        int finalStart = start;
        int first = IntStream.range(0, len)
                .filter(i -> i <= finalStart)
                .map(i -> arr[i])
                .reduce(1, (a, b) -> a * b);
        int last = IntStream.range(0, len)
                .filter(i -> i > finalStart)
                .map(i -> arr[i])
                .reduce(1, (a, b) -> a * b);
        if (first == last) {
          System.out.println("YES");
          System.exit(0);
          return;
        }
      }
    }
    System.out.println("NO");
  }
}
