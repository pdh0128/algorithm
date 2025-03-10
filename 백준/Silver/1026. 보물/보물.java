import java.text.ParseException;
import java.util.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws ParseException {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for(int i = 0; i < n; i++) {
      b[i] = sc.nextInt();
    }
   a = Arrays.stream(a).sorted().toArray();
    b = Arrays.stream(b).boxed().sorted(Comparator.reverseOrder()).mapToInt(x -> x).toArray();

    int result = 0;
    for(int i = 0; i < n; i++) {
      result += a[i] * b[i];
    }
    System.out.println(result);
  }
}
