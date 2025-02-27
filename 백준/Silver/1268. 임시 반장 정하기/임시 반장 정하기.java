import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] students = new int[n][5];
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < 5; j++) {
        students[i][j] = sc.nextInt();
      }
    }
    int max = 0;
    int idx = 0;

    for(int i = 0; i < n; i++) {
      Set<Integer> set = new HashSet<>();
      for(int j = 0; j < 5; j++) {
        for(int k = 0; k < n; k++) {
          if (students[i][j] == students[k][j] && i != k) {
             set.add(k);
            // System.out.println((i + 1) + " : " + (k + 1) + " : " + set.size());
          }
        }
        if (set.size() > max) {
          max = set.size();
          idx = i;
        }
      }
    }
    System.out.println(idx + 1);
  }
}
