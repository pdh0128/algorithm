import java.util.*;

public class Main {
  static Stack s = new Stack();
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    for(int i = 0; i < t; ++i) {
      String command = sc.nextLine();
      stackCommand(command);
    }
    
  }

  private static void stackCommand(String command) {
    if (command.startsWith("push")) {
      String value = command.split(" ")[1];
      s.push(command.split(" ")[1]);
    }
    else if (command.startsWith("top")) {
      if (s.empty()) System.out.println(-1);
      else System.out.println(s.peek());
    }
    else if (command.startsWith("size")) {
      System.out.println(s.size());
    }
    else if (command.startsWith("empty")) {
      if (s.empty()) System.out.println(1);
      else System.out.println(0);
    }
    else if (command.startsWith("pop")) {
      if (s.empty()) System.out.println(-1);
      else System.out.println(s.pop());
    }
  }

}
