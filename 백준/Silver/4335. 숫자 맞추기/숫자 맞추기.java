import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    while(true) {
      String answer;
      List<Integer> high = new ArrayList<>();
      List<Integer> low = new ArrayList<>();
      int goal;
      while (true) {
        n = sc.nextInt();
        if (n == 0) {
          System.exit(0);
        }
        sc.nextLine();
        answer = sc.nextLine();
        if (answer.equals("too high")) {
          high.add(n);
        } else if (answer.equals("too low")) {
          low.add(n);
        } else if (answer.equals("right on")) {
          goal = n;
          break;
        }
      }
      boolean flag = true;
      for(int h : high) {
        if (goal >= h) flag = false;
      }
      for(int l : low) {
        if (goal <= l) flag = false;
      }
      if (flag) {
        System.out.println("Stan may be honest");
      } else {
        System.out.println("Stan is dishonest");
      }
    }
  }
}
