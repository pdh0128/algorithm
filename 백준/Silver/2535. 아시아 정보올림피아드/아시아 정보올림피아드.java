import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class Main {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
     int n = sc.nextInt();
     List<Student> students = new ArrayList<>();
     for(int i = 0; i < n; ++i) {
       // 국가, 식별자, 점수 입력 받기
       int country = sc.nextInt();
       int id = sc.nextInt();
       int score = sc.nextInt();
       students.add(new Student(country, id, score));
     }
     // 국가별로 점수로 줄 세우기
    students = sortGroupByCountry(students);
     // 메달 수여
    rewardMedal(students);
  }

  private static List<Student> sortGroupByCountry(List<Student> students) {
    // 국가별로 묶기
    Map<Integer, List<Student>> collect = students
            .stream()
            .sorted(Comparator.comparing(Student::getScore).reversed())
            .collect(groupingBy(Student::getCountry, LinkedHashMap::new, toList()));
    List<Student> studentsList = new ArrayList<>();

    for(int i : collect.keySet()) {
      List<Student> list = collect.get(i);
      for(int j = 0; j < 2 && j < list.size(); ++j) {
        studentsList.add(list.get(j));
      }
    }
    return studentsList;
  }

  private static void rewardMedal(List<Student> students) {
    Student dumy = new Student(0, 0, 0);
    Student gold = dumy;
    Student silver = dumy;
    Student dong = dumy;
    for(Student s : students) {

      if (s.score > gold.score) { // 금메달 수여
        gold = s;
      }
      else if (s.score > silver.score) { // 은메달 수여
        silver = s;
      }
      else if (s.score > dong.score) {// 동메달 수여
        dong = s;
      }
    }
    System.out.println(gold.country + " " + gold.id);
    System.out.println(silver.country + " " + silver.id);
    System.out.println(dong.country + " " + dong.id);
  }
}

class Student {
  int country; // 나라
  int id;
  int score;
  public Student(int country, int id, int score) {
    this.country = country;
    this.id = id;
    this.score = score;
  }

  public Integer getCountry() {
    return this.country;
  }

  public Integer getScore() {
    return this.score;
  }
}
