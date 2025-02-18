import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    Map<Integer, String> uos = new HashMap<>();
    uos.put(0, "U");
    uos.put(1, "O");
    uos.put(2, "S");
    System.out.println(uos.get((n - 1) % 3));
  }
}
