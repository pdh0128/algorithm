import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    List<Integer> list = new LinkedList<>();
    for(int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }
  int result = solve(list, m);
    System.out.println(result);
  }
  private static int solve(List<Integer> list, int m) {
    List<Integer> result = new LinkedList<>();
    for(int i = 0; i < list.size(); i++) {
      for(int j = i+1; j < list.size(); j++) {
        for(int k = j+1; k < list.size(); k++) {
          int sum = list.get(i) + list.get(j) + list.get(k);
          if (!list.contains(sum)) {
            result.add(sum);
          }
        }
      }
    }
    result.sort(Comparator.reverseOrder());
    for(int item : result) {
      if (item <= m) return item;
    }
  return -1;
  }
}
