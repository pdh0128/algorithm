import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int n;
    int total_ate;
    int[] pig = new int[6];
    int day;
    for(int i = 0; i < t; ++i) {
      total_ate = 0;
      n = sc.nextInt();
      day = 1;
      for (int j = 0; j < 6; ++j) {
        pig[j] = sc.nextInt();
        total_ate += pig[j];
      }

      int[] cur = new int[6];
      while (total_ate <= n) {
        day++;
        total_ate = 0;
        for (int j = 0; j < 6; ++j) {
          int ate = pig[j];;
          if (j == 0) ate += pig[5];
          else ate += pig[j - 1];
          // System.out.println("왼쪽 돼지 먹은양 더하기 : " + ate);
          if (j == 5) ate += pig[0];
          else ate += pig[j + 1];
          // System.out.println("오른쪽 돼지 먹은양 더하기 : " + ate);
          ate += pig[(j + 3) % 6];
          // System.out.println("반대편 돼지 먹은양 더하기 : " + ate);
          cur[j] = ate;
        }
        for(int j = 0; j < 6; ++j) {
          pig[j] = cur[j];
          total_ate += pig[j];
        }

      }
      System.out.println(day);
    }
  }
}
