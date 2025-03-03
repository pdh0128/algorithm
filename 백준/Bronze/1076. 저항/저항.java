import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Map<String, List<Integer>> color = new HashMap();
    String[] colors = new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    int a = 1;
    for(int i = 0; i < colors.length; i++) {
      color.put(colors[i], List.of(i, a));
      a *= 10;
    }
    String[] inputColor = new String[3];
    for(int i = 0; i < 3; ++i) {
      if (sc.hasNextLine()) {
        inputColor[i] = sc.nextLine();
      } else {
        return;
      }
    }
    long result = color.get(inputColor[0]).get(0) * 10;;
    result += color.get(inputColor[1]).get(0);
    result *= color.get(inputColor[2]).get(1);
    System.out.println(result);

  }
}
