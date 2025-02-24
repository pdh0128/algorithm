import java.util.*;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1; i <= n; i++) {
      int[] arr = new int[5];
      for(int j = 0; j < 5; j++) {
        arr[j] = sc.nextInt();
      }
      System.out.println("Case #" + i + ": " + Arrays.stream(arr).max().getAsInt());
    }
  }
}
