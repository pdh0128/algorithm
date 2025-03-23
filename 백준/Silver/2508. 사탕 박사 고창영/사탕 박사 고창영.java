import java.util.*;

public class Main {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    int t = sc.nextInt();
    for(int i = 0; i < t; ++i) {
      // 행렬(사탕박스) 입력받기
      int r = sc.nextInt(); // 행 갯수
      int s = sc.nextInt(); // 열 갯수
      sc.nextLine();
      String[][] box = inputBox(r, s); // 박스 입력받기
//      checkBox(box);
      System.out.println(countCandy(box));// 사탕 갯수세기
    }
  }

  private static int countCandy(String[][] box) { // 사탕 갯수세기
    int cnt = 0;
    for(int i = 0; i < box.length; ++i) {
      for(int j = 0; j < box[i].length; ++j) {
        // 가로 사탕 >o< 세기
        if (j + 2 < box[i].length) {
          if (box[i][j].equals(">") && box[i][j + 1].equals("o") && box[i][j + 2].equals("<")) { //
            cnt++;
            j += 2;
          }
        }
        // 세로 사탕 v \n o \n ^ 세기
        if (i + 2 < box.length) {
          if (box[i][j].equals("v") && box[i + 1][j].equals("o") && box[i + 2][j].equals("^")) {
            cnt++;
          }
        }
      }
    }
    return cnt;
  }

  private static String[][] inputBox(int r, int s) { // 박스 입력받기
    String[][] box = new String[r][s];
    String temp = "";
    for(int i = 0; i < r; ++i) {
      temp = sc.next();
      for(int j = 0; j < s; ++j) {
        box[i][j] = String.valueOf(temp.charAt(j));
      }
    }
    return box;
  }

  private static void checkBox(String[][] box) { // 박스 입력받기
   for(int i = 0; i < box.length; ++i) {
     for(int j = 0; j < box[i].length; ++j) {
       System.out.print(box[i][j] + " ");
     }
     System.out.println();
   }
  }
}

