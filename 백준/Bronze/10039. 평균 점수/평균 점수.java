import java.util.*;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   int[] n = new int[5];
   for(int i = 0; i < n.length; i++){
     n[i] = sc.nextInt();
     if (n[i] < 40) {
       n[i] = 40;
     }
   }
    System.out.println(Arrays.stream(n).sum() / n.length);
  }
}
