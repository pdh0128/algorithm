import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, m;
    n = sc.nextInt();
    m = sc.nextInt();
    List[] card = new LinkedList[n];
    for(int i = 0; i < n; i++) {
      List<Integer> cards = new LinkedList<>();
      for(int j = 0; j < m; j++) {
        cards.add(sc.nextInt()); // 배열 안에 리스트로 다 받기
      }
      card[i] = cards;
    }
    int max;
    int realMax = 0;
    int[] score = new int[n];
    for(int i = 0; i < n; i++) {
      score[i] = 0;
    }

    for(int i = 0; i < m; i++) { // m번의 경기 후
      realMax = 0;
      List<Integer> idx = new ArrayList<>();
//      System.out.println((i + 1) + "번째 경기");
      int idxx = -1;
      for(int j = 0; j < n; j++) { // 각자 최댓값 찾기
        max = card[j].stream().mapToInt(p -> (int) p).max().getAsInt();
//        System.out.println(j + " : " + max);
//        System.out.println(j + "번 학생 : " + max);
        if (realMax < max) {
          realMax = max;
        }
      }
//      System.out.println( "최댓값 : " + realMax);
      for(int j = 0; j < n; j++) {
        max = card[j].stream().mapToInt(p -> (int) p).max().getAsInt();
        if (realMax == max) {
          idx.add(j);
//          System.out.print(j + " ");
        }
        card[j].remove((Object) max); // 쓴 카드는 버리기
      }
//      System.out.println();
      for(int j : idx) {
        score[j]++;
//        System.out.println(j + "번 학생 점수++");
      }
    }
//    for(int i : score) {
//      System.out.print(i + " ");
//    }
//    System.out.println();
    realMax = Arrays.stream(score).max().getAsInt();
    for(int i = 0; i < n; i++) {
      if (realMax == score[i]) {
        System.out.print((i + 1) + " ");
      }
    }
  }
}
