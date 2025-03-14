import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String document = sc.nextLine();
    String pattern = sc.nextLine();
    int docLength = document.length();
    int patLength = pattern.length();
    int count = 0;

    for (int i = 0; i <= docLength - patLength; ) {
      String substring = document.substring(i, i + patLength);
      if (substring.equals(pattern)) {
        count++;
        i += patLength; 
      } else {
        i++;
      }
    }
    System.out.println(count);
  }
}
