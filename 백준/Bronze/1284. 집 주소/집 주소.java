import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = "0";
    while (true) {
      n = sc.nextLine();
      if (n.equals("0")) break;
      int length = n.length(); // 각 숫자 사이 여백
      int zero = (int)n.chars().filter(c -> c == '0').count(); // 0 갯수
      int one = (int)n.chars().filter(c -> c == '1').count(); // 1 갯수
      length += (one * 2) + (zero * 4) + ((n.length() - (one + zero)) * 3) + 1;
      System.out.println(length);
    }
  }
}
