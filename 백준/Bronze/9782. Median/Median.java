import java.util.*;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 1;
    while (true) {
      int t = sc.nextInt();
      if (t == 0) break;
      int[] n = new int[t];
      for (int i = 0; i < t; i++) {
        n[i] = sc.nextInt();
      }
      float result;
      if ((n.length & 1) != 0) {
        result = n[n.length / 2];
      }
      else {
        result = (float) (n[n.length / 2 - 1 ] + n[n.length / 2 ]) / 2;
      }
      System.out.println("Case " + a++ + ": " + result);
    }
  }

}
