import java.util.*;

public class Main {
  static String[] gather = new String[] {"a", "e", "i", "o", "u"};
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String word;
    while (true) {
      word = sc.nextLine();
      if (word.equals("end")) break;
      if(first_rule(word) && second_rule(word) && third_rule(word)) {
        System.out.println("<" + word + "> is acceptable.");
      }
      else System.out.println("<" + word + "> is not acceptable.");

    }


  }
  private static boolean first_rule(String word) {
    return Arrays.stream(gather).anyMatch(word::contains);
  }
  private static boolean second_rule(String word) {
    int sequence = 0;
    boolean lastIsGather = false;
    boolean isGather = false;
    for(int i = 0; i < word.length(); i++) {
      for(String s : gather) {
        if(word.charAt(i) == s.charAt(0)) {
          isGather = true;
        }
      }
      if (lastIsGather == isGather || i == 0){
        sequence++;
      }
      else {
        sequence = 1;
      }
      lastIsGather = isGather;
      isGather = false;
      if (sequence == 3) {
        return false;
      }
    }
    return true;
  }
  private static boolean third_rule(String word) {
    for(int i = 1; i < word.length(); i++) {
      if (word.charAt(i) == word.charAt(i-1)) {
        if (word.charAt(i) != 'e' && word.charAt(i) != 'o') return false;
      }
    }
    return true;
  }
}
