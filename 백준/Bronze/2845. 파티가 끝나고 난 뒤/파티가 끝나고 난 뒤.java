import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int w = sc.nextInt();
    for(int i = 0; i < 5; i++) {
      System.out.println(sc.nextInt() - n * w );
    }

  }
}
