import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    String[] n = new String[t];
    for(int i = 0; i < t; i++) {
      n[i] = sc.nextLine();
    }

    int k = n.length;
    String[] con = new String[t];
      for(int len = n[0].length(); len >= 0; --len) {
        for(int i = 0; i < t; i++) {
          con[i] = n[i].substring(len, n[0].length());
//          System.out.println(con[i]);
        }
        List<String> list = new ArrayList<>();
        for(int i = 0; i < t; i++) {
          if(list.contains(con[i])) {
            k = n[0].length() - len + 1;
          }
          else list.add(con[i]);
        }
    }
      System.out.println(k);
  }
}
