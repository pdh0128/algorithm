import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int len = 64;
    int goal_len = sc.nextInt();
    List<Integer> abandon_stick_list = new ArrayList<>();
    List<Integer> stick_list = new ArrayList<>();
    stick_list.add(len);
    while (len > goal_len) {
      int short_stick = stick_list.stream().mapToInt(i -> i).min().orElseThrow();
      stick_list.remove(Integer.valueOf(short_stick));
      int short_stick_half = short_stick / 2;
      if(short_stick_half + stick_list.stream().mapToInt(i -> i).sum() >= goal_len) {
        stick_list.add(short_stick_half);
        abandon_stick_list.add(short_stick_half);
      }
      else {
        stick_list.add(short_stick_half);
        stick_list.add(short_stick_half);
      }
      len = stick_list.stream().mapToInt(i -> i).sum();
    }
    System.out.println(stick_list.size());
  }
}
