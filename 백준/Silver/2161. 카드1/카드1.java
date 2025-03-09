import java.awt.desktop.AboutEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
  public static void main(String[] args) throws ParseException {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] abandoned = new int[n];
    Queue<Integer> q = new LinkedList<>();
    for(int i = 0; i < n; i++) {
      q.offer(i + 1);
    }
    int idx = 0;
    while (true) {
      if (q.size() == 1) break;
      abandoned[idx++] = q.poll();
      q.offer(q.poll());
    }
    for(int i = 0; i < n - 1; i++) {
      System.out.print(abandoned[i] + " ");
    }
    System.out.println(q.poll());
  }
}
