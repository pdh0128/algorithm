import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    n %= 8;
    if (n == 1) {
      System.out.println(1);
    }
    else if (n == 2 || n == 0) {
      System.out.println(2);
    }
    else if (n == 3 || n == 7) {
      System.out.println(3);
    }
    else if (n == 4 || n == 6) {
      System.out.println(4);
    }
    else if (n == 5) {
      System.out.println(5);
    }
  }
}
