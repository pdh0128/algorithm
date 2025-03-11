import java.text.ParseException;
import java.util.*;

public class Main {

  public static void main(String[] args) throws ParseException {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] price = new int[m][2];
    // 입력
    for(int i = 0; i < m; ++i) {
      for(int j = 0; j < 2; ++j) {
        price[i][j] = sc.nextInt();
      }
    }
  int pac = price[0][0];
    int sin = price[0][1];
    for(int i = 1; i < m; ++i) {
      if (price[i][0] < pac) {
        pac = price[i][0];
      }
      if (price[i][1] < sin) {
        sin = price[i][1];
      }
    }
    int minus_money = 0;
    for(int i = n; i > 0;) { // n은 고쳐야하는 기타줄 갯수
      if ((i >= 6 && pac < (sin * 6)) || (i < 6) && pac < (sin * i)) {
        minus_money += pac;
        i -= 6;
      }
      else {
        minus_money += sin;
        i--;
      }

    }
    System.out.println(minus_money);

    }
}

