import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];
    List<Integer> list = new ArrayList<>();
    for(int i = 0; i < 9; ++i) {
      arr[i] = sc.nextInt();
    }

  solve(arr, list, 0, 0);

  }
  public static void solve(int[] arr, List<Integer> result, int index, int deepth) {
    if (deepth == 7) {
      if (result.stream().mapToInt(i -> i).sum() == 100) {
        result.sort(Comparator.naturalOrder());
        for(int item: result) {
          System.out.println(item);
        }
        System.exit(0);
      }
      return;
    }

    for(int i = index; i < 9; ++i) {
      result.add(arr[i]);
      solve(arr, result, i + 1, deepth + 1);
      result.remove(result.size() - 1);
    }
  }
}
