import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float x,y;
    while(true) {
      String location = sc.nextLine();
      x = Float.parseFloat(location.split(" ")[0]);
      y = Float.parseFloat(location.split(" ")[1]);
      String part = null;
      if (x > 0 && y > 0) {
        part = "Q1";
      }
      else if (x < 0 && y > 0) {
        part = "Q2";
      }
      else if (x < 0 && y < 0) {
        part = "Q3";
      }
      else if (x > 0 && y < 0) {
        part = "Q4";
      }
      else if (x == 0 || y == 0) {
        part = "AXIS";
      }
      System.out.println(part);
      if (x == 0 && y == 0) {
        break;
      }
    }
  }
}
