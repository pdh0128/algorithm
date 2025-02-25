import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String today = scanner.nextLine();
    String d_day = scanner.nextLine();

    int Tyear = Integer.parseInt(today.split(" ")[0]);
    int Tmonth = Integer.parseInt(today.split(" ")[1]);
    int Tday = Integer.parseInt(today.split(" ")[2]);

    int Dyear = Integer.parseInt(d_day.split(" ")[0]);
    int Dmonth = Integer.parseInt(d_day.split(" ")[1]);
    int Dday = Integer.parseInt(d_day.split(" ")[2]);

    int Tdays = getDays(Tyear, Tmonth, Tday);
    int Ddays = getDays(Dyear, Dmonth, Dday);
    if( (Dyear - Tyear > 1000) || (Dyear - Tyear == 1000 && Dmonth - Tmonth > 0) || (Dyear - Tyear == 1000 && Dmonth - Tmonth == 0 && Dday - Tday >= 0) ){
      System.out.println("gg");
    }else{
      System.out.println("D-" + (Ddays - Tdays));
    }

  }
  public static int[] getYear(int year){
    int[] month = {31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31};
    if(year % 4 ==0 && year % 100 != 0 || year % 400==0){
      month[1] = 29;
    }
    return month;
  }
  public static int getDays(int year, int month, int day){
    int days = 0;
    int[] months;
    for(int i = 1; i < year; ++i) {
      months = getYear(i);
      for(int j = 0; j < 12; ++j) {
        days += months[j];
      }
    }
    months = getYear(year);
    for(int i = 0; i < month - 1; ++i) {
      days += months[i];
    }
    days += day;
    return days;
  }
}
