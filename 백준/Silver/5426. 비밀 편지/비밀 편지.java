import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    for(int i = 0; i < t; ++i) {
      String str = sc.nextLine();
     String result = solution(str);
     System.out.println(result);
    }
  }

  private static String solution(String str) {
    int size = (int) Math.sqrt(str.length());
    char[][] matrix = new char[size][size];
    int a = 0;
    for(int i = 0; i < size; ++i) {
      for(int j = 0; j < size; ++j) {
        matrix[i][j] = str.charAt(a++); // init
      }
    }
    StringBuilder sb = new StringBuilder();
    for(int j = size -1 ; j >= 0; --j) {
      for(int i = 0; i < size; ++i) {
        sb.append(matrix[i][j]);
      }
    }
    return sb.toString();
  }
}
