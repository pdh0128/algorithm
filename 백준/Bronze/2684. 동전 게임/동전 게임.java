import java.net.PortUnreachableException;
import java.util.*;

public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  Map<String, Integer> pattern = new HashMap<>();
  String[] pattern_zip = new String[]{"TTT", "TTH", "THT", "THH", "HTT", "HTH", "HHT", "HHH"};
  for(int i = 0; i < 8; ++i) {
    pattern.put(pattern_zip[i], i);
  }
  int n = sc.nextInt();
  sc.nextLine();
  for(int i = 0; i < n; ++i) {
    int[] coins = new int[8];
    String coin = sc.nextLine();
    Queue<Character> tunnel = new LinkedList<>();
    for(char c : coin.toCharArray()) {
      tunnel.add(c);
      if (tunnel.size() == 3) {
        String frist = "" + tunnel.poll();
        String second = "" + tunnel.poll();
        String third = "" + tunnel.poll();
        String _pattern = "" + frist + second + third;
        coins[pattern.get(_pattern)]++;
        tunnel.add(second.charAt(0));
        tunnel.add(third.charAt(0));
      }
    }
    for(int c : coins) {
      System.out.print(c + " ");
    }
    System.out.println();
  }

  }
}
