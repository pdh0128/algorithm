import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Integer n = sc.nextInt();
       int[] castle = new int[26];
       for (int i = 0; i < 26; i++) {
           castle[i] = 0;
       }

       sc.nextLine();
       for(int i = 0; i < n; i++){
           String s = sc.nextLine();
           castle[s.charAt(0) - 'a']++;
       }
       Boolean flag = true;
        for(int i = 0; i < 26; i++){
            if (castle[i] >= 5){
                flag = false;
                System.out.print((char ) ('a' + i));
            }
        }
        if (flag){
            System.out.println("PREDAJA");
        }
    }
}