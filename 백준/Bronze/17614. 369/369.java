import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cnt = 0;
    for(int i = 1; i <= n; i++) {
      String cur = Integer.toString(i);
      for(char item : cur.toCharArray()) {
        if (item == '3' || item == '6' || item == '9') {
          cnt++;
        }
      }
    }
    System.out.println(cnt);
  }
}
