import java.awt.desktop.AboutEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
  static StringBuilder sb = new StringBuilder();
  static Queue<Character> queue = new LinkedList<>();
  public static void main(String[] args) throws ParseException {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    for (char c : str.toCharArray()) {
      if (c == '.') {
        solution();
        sb.append(".");
      }
      else queue.add(c);
    }

    solution();
    System.out.println(sb);
  }
  private static void solution() {
    if (!((queue.size() & 1) == 0)) { // 홀수
      System.out.println(-1);
      System.exit(0);
    }
    while(queue.size() >= 2) {
      if (queue.size() >= 4) {
        for (int i = 0; i < 4; i++) { //큐에서 4번 빼고 문장에 4번 추가
          queue.poll();
          sb.append("A");
        }
      }
      else {
        for (int i = 0; i < 2; i++) { // 큐에서 2번 빼고 문장에 2번 추가
          queue.poll();
          sb.append("B");
        }
      }

    }
  }
}
