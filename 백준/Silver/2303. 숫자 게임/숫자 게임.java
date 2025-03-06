import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] matrix = new int[n][5];

    for(int i = 0; i < n; i++) {
      for(int j = 0; j < 5; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
int max = 0;
    int value;
    int idx = 0;
    for(int i = 0; i < n; i++) {
//      System.out.println("---------" + (i + 1) + "번째 ----------");
      value = getMax(matrix[i]);
      if (max <= value) {
        max = value;
        idx = i + 1;
      }
    }
    System.out.println(idx);

  }
  private static int getMax(int[] n) {
    Set<Integer> set = new HashSet<>();
    int max = 0;
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < 5; j++) {
        if (i == j) continue;
        for(int k = 0; k < 5; k++) {
          if (i == k || j == k) continue;
          int sum = n[i] + n[j] + n[k];
          if (!set.contains(sum)) {
            set.add(sum);
            // System.out.println(n[i] + " + " + n[j] + " + " + n[k] + " : 합 : " + sum);
            int value = getOne(sum);
            if (max < value) {
              max = value;
            }
          }
        }
      }
    }
//    System.out.println(max);
    return max;
  }
  private static int getOne(int n) {
    return n % 10;
  }
}
