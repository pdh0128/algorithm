import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
  public static void main(String[] args) throws ParseException {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
    Map<String, Date> map = new HashMap<>();
    for(int i = 0; i < n; i++) {
      String name = sc.next();
      String date = sc.nextLine();
      Date birthday = sdf.parse(date);
      map.put(name, birthday);
    }
    String young_guy = null;
    String old_guy = null;
    Date young = sdf.parse("12 12 1989");
    Date old = sdf.parse("12 12 2011");
    for(Map.Entry<String, Date> entry : map.entrySet()) {
      String key = entry.getKey();
      Date value = entry.getValue();
      if (young.before(value)) {
        young = value;
        young_guy = key;
      }

      if (old.after(value)) {
        old = value;
        old_guy = key;
      }

    }
    System.out.println(young_guy);
    System.out.println(old_guy);
  }
}
