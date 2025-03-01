import java.util.*;

public class Main {
  static Map<Integer, List<Integer>> table = new HashMap<>();
  static int n;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int[] stone = new int[n];
    for(int i = 0; i < n; ++i) {
      stone[i] = sc.nextInt();
    }
    for(int i = 0; i < n; ++i) {
      if (!table.containsKey(i)) {
        table.put(i, new ArrayList<>());
      }
      for(int j = 0; j < n; ++j) {
        if (j == i) continue;
        if ((i - j) % stone[i] == 0) {
          table.get(i).add(j);
        }
      }
      table.get(i).sort(Comparator.reverseOrder());
    }
//    int a = sc.nextInt();
//    int b = sc.nextInt();
    bfs(sc.nextInt() - 1, sc.nextInt() - 1);
  }
  private static void bfs(int a, int b) {
    boolean[] visited = new boolean[n];
    Queue<Integer> q = new LinkedList<>();
    q.add(a);
    visited[a] = true;
    int cnt = 0;
    while(!q.isEmpty()) {
      int levelSize = q.size();
      for(int i = 0; i < levelSize; ++i) {
        int cur = q.poll();
        if (cur == b) {
          System.out.println(cnt);
          return;
        }

        if (table.containsKey(cur)) {
          for (int item : table.get(cur)) {
            if (!visited[item]) {
              visited[item] = true;
              q.add(item);
            }
          }
        }
      }
      ++cnt;
    }
    System.out.println(-1);
  }
}
