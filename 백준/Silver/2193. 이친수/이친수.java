import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] arr = new long[1000001];
    arr[0] = 0;
    arr[1] = 1;
    arr[2] = 1;
    for(int i = 3; i <= n; ++i) {
      arr[i] = (arr[i-1] + arr[i-2]);
    }
    System.out.println(arr[n]);
  }
}
