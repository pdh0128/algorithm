import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] set = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    List<Integer> list = new ArrayList<>();
    String room = sc.nextLine();
    int cnt = 0;
    for(char c : room.toCharArray()) {
      boolean flag = true;
      int n = Integer.parseInt(String.valueOf(c));
      if (!list.contains(n)){
        if (n == 6 && !list.contains(6) && list.contains(9)) {
          flag = false;
          list.remove((Object)9);
        }
        else if (n == 9 && !list.contains(9) && list.contains(6)) {
          flag = false;
          list.remove((Object)6);
        }
        else {
          cnt++;
          for (int i : set) {
            list.add(i);
          }
        }
      }
      if (flag) {
        list.remove((Object)n);
        }
//      for(int i : list) System.out.print(i + " ");
//      System.out.println();
    }
    System.out.println(cnt);
  }
}
