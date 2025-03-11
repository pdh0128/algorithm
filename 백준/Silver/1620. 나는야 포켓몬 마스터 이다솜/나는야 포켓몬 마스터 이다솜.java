import java.text.ParseException;
import java.util.*;

public class Main {

  public static void main(String[] args) throws ParseException {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    Map<Integer, String> pocketmon = new HashMap<>();
    Map<String, Integer> pocketmon2 = new HashMap<>();
    for(int i = 0; i < n; ++i) {
      String name = sc.next();
      pocketmon.put(i + 1, name);
      pocketmon2.put(name, i + 1);
    }
    String order;
    String result = null;
    sc.nextLine();
    for(int i = 0; i < m; ++i) {
      order = sc.nextLine();
      try {
        int key = Integer.parseInt(order);
        result = pocketmon.get(key);
      }
      catch (NumberFormatException e) {
        result = String.valueOf(pocketmon2.get(order));
      }
      
      System.out.println(result);
    }

  }
}

