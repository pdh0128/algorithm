import javax.print.DocFlavor;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 1;
    while (true) {
      int n = sc.nextInt();
      if (n == 0) break;
      sc.nextLine();
      String[] names = new String[n];
      Map<Integer, Character> map = new HashMap<>();
      for (int i = 0; i < n; ++i) {
        names[i] = sc.nextLine();
      }
      int number;
      char alpha;
      for (int i = 0; i < 2 * n - 1; ++i) {
        number = sc.nextInt();
        alpha = sc.next().charAt(0);
        if (map.containsKey(number)) {
          map.put(number, 'c');
        } else map.put(number, alpha);
      }
      for (Map.Entry<Integer, Character> entry : map.entrySet()) {
        if (entry.getValue() != 'c') {
          System.out.println(a++ + " " + names[entry.getKey() - 1]);
        }
      }
    }
  }
}
