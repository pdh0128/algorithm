import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int res = solve(arr);
    System.out.println(res);
  }
  private static int solve(int[] arr) {
    List<Integer> res = new ArrayList<>();
    int sum = 0;
    for (int start = 0; start < arr.length; start++) {
      sum += arr[start];
      res.add(sum);
    }

    return res.stream()
            .min(Comparator.comparingInt((Integer i) -> Math.abs(100 - i))
                    .thenComparingInt(i -> -i))
            .orElseThrow();
  }
}
