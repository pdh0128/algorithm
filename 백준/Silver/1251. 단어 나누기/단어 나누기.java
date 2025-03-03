import java.util.*;

public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  String word = sc.nextLine();
  List<String> resultSet = new ArrayList<>();
  for(int i = 1; i < word.length() / 2 + 1; i++) {
    for(int j = i + 1; j < word.length(); j++) {
      List<String> wordList = split(word, i, j);
      List<String> newWordList = new ArrayList<>();
      if (wordList.get(0).length() >= 1 && wordList.get(1).length() >= 1 && wordList.get(2).length() >= 1) {
        for(String s : wordList) {
          newWordList.add(flip(s));
        }
        resultSet.add(merge(newWordList));
      }
    }
  }
  String result = resultSet.get(0);
  for(String s : resultSet) {
    if (result.compareTo(s) > 0) {
      result = s;
    }
  }
    System.out.println(result);
  }
  private static List<String> split(String word, int start, int end) {
    List<String> list = new ArrayList<>();
    list.add(word.substring(0, start));
    list.add(word.substring(start, end));
    list.add(word.substring(end, word.length()));
//    System.out.println("split : "+ list);
    return list;
  }
  private static String flip(String word) {
    Stack<Character> stack = new Stack<>();
    for(char c : word.toCharArray()) {
      stack.push(c);
    }
    StringBuilder sb = new StringBuilder();
    while(!stack.isEmpty()) {
      sb.append(stack.pop());
    }
//    System.out.println("flip : " + sb.toString());
    return sb.toString();
  }
private static String merge(List<String> wordList) {
    StringBuilder sb = new StringBuilder();
    for(String word : wordList) {
      sb.append(word);
    }
//  System.out.println("merge : " + sb.toString());
    return sb.toString();
}
}
