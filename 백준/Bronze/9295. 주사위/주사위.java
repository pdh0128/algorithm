import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();
    int t = scanner.nextInt();
    for(int i = 0; i < t; i++) {
      int n1 = scanner.nextInt();
      int n2 = scanner.nextInt();
      list.add(n1 + n2);
    }

    for(int i = 0; i < list.size(); i++) {
      System.out.println("Case " + (i + 1) + ": "+ list.get(i));
    }
  }
}
