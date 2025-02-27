import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] matrix = new int[100][100];
    for(int i = 0; i < 100; ++i) {
      for(int j = 0; j < 100; ++j) {
        matrix[i][j] = 0;
      }
    }
    int cnt = 0;
    for(int i = 0; i < n; ++i) {
      int lx = sc.nextInt();
      int ly = sc.nextInt();
      int rx = sc.nextInt();
      int ry = sc.nextInt();
      for(int j = lx - 1; j < rx; ++j) {
        for(int k = ly - 1; k < ry; ++k) {
          matrix[j][k] += 1;
          if (matrix[j][k] == m + 1) {
            ++cnt;
          }
        }
      }
    }
    System.out.println(cnt);
  }
}
