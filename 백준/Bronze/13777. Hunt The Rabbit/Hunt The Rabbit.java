

import java.util.Scanner;

class BinSearch {
  static int binSearch(int[] a, int n, int key) {
    int pl = 1;
    int pr = n - 1;
    do {
      int pc = (pl + pr) / 2;
      System.out.print(a[pc] + " ");
      if (a[pc] == key) {
        return pc;
      }
      else if (a[pc] < key) {
        pl = pc + 1;
      }
      else if (a[pc] > key) {
        pr = pc - 1;
      }
    } while(pl <= pr);
    return -1;
  }
}


public class Main {
  public static void main(String[] args) {
    int[] num = new int[51];
    for(int i = 1; i <= 50; i++) {
      num[i] = i;
    }
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextInt()) {
      int a = sc.nextInt();
      if (a == 0) {
          break;
      }
      int result = BinSearch.binSearch(num, num.length, a);
    }
  }
}
