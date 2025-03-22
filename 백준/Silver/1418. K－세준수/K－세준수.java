import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    System.out.println(solve(n, k));
  }

  private static int solve(int n, int k) { // k-세준수를 구하자
    int cnt = 0;
    for(int i = 1; i <= n; ++i) {
      int max = getSoinsu(i); // (1) 가장 큰 소인수 구하기
      if (max <= k ) { // 조건에 부합하면 k- 세준수
        cnt++;
      }
    }
    return cnt;
  }
  private static int getSoinsu(int n) { // (1) 가장 큰 소인수 구하기
    int max = 0;
    while(n % 2 == 0) { // 2로 나누어지는 경우 모두 처리
      max = 2;
      n /= 2;
    }
    for(int i = 3; i <= Math.sqrt(n); i += 2) { // 2 제외하면 모두 홀수
      while (n % i == 0) {
        max = i;
        n /= i;
      }
    }
    if (n > 2) max = n;
    return max;
  }

}
