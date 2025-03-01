import java.util.*;

public class Main {
  static Map<Integer, List<Integer>> table = new HashMap<>();
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int v = sc.nextInt();
    for(int i = 0; i < m; ++i) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      if (!table.containsKey(a)) {
        table.put(a, new ArrayList<>());
      }
      if (!table.containsKey(b)) {
        table.put(b, new ArrayList<>());
      }
      table.get(a).add(b);
      table.get(b).add(a);
      table.get(a).sort(Comparator.naturalOrder());
      table.get(b).sort(Comparator.naturalOrder());
    }
    dfs(v, new HashSet<>());
    System.out.println();
    bfs(v, new HashSet<>());
  }
  private static void dfs(int node, Set<Integer> visited) {
    visited.add(node);
    System.out.print(node + " ");
    if (table.containsKey(node)) {
      for(int item : table.get(node)) {
        if(!visited.contains(item)) {
          dfs(item, visited);
        }
      }
    }
  }
  private static void bfs(int node, Set<Integer> visited) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(node);
    while(!queue.isEmpty()) {
      node = queue.poll();
      visited.add(node);
      System.out.print(node + " ");
      if (table.containsKey(node)) {
        for(int item : table.get(node)) {
          if(!visited.contains(item)) {
            visited.add(item);
            queue.add(item);
          }
        }
      }
    }

  }
}
