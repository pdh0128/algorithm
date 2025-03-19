import javax.xml.transform.Source;
import java.util.*;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] num = new int[8];
    for(int i = 0; i < 8; ++i) {
      num[i] = sc.nextInt();
    }
    int max;
    int idx = 0;
    int sum = 0;
    List<Integer> result = new ArrayList<>();
    for(int i = 0; i < 5; ++i) {
      max = 0;
      for(int j = 0; j < 8; ++j) {
        if (max < num[j]) {
          max = num[j];
          idx = j;
        }
      }
      num[idx] = 0;
      sum += max;
      result.add(idx + 1);
    }
    System.out.println(sum);
    Collections.sort(result);
    for(int i = 0; i < result.size(); ++i) {
      System.out.print(result.get(i) + " ");
    }
  }
}
