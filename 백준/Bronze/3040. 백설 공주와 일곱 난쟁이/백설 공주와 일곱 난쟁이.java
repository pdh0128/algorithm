import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] dwarf = new int[9];
    for(int i = 0; i < 9; ++i) {
      dwarf[i] = sc.nextInt();
    }
    List<Integer> resulted = new ArrayList<>();
    // for(int item : dwarf) System.out.println(item);
    solve(dwarf, resulted, 0, 0);
    }
    private static void solve(int[] dwarf, List<Integer> resulted, int cur, int deepth) {
    if (deepth == 7) {
      if (resulted.stream().mapToInt(i -> i).sum() == 100) {
        for(int item : resulted) System.out.println(item);
        System.exit(0);
      }
      return;
    }

    for(int i = cur; i < dwarf.length; ++i) {
      resulted.add(dwarf[i]);
      solve(dwarf, resulted, i + 1, deepth + 1);
      resulted.remove(resulted.size() - 1);
    }
    }
}
