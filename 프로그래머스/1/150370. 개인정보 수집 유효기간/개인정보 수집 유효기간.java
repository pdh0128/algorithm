import java.util.*;

class Solution {
  
  public int[] solution(String today, String[] terms, String[] privacies) {
    int cur_day = parseDay(today);
    Map<String, Integer> interval = new HashMap<>();
    for(String term : terms) {
      String key = term.split(" ")[0];
      int value = Integer.parseInt(term.split(" ")[1]);
      interval.put(key, value);
    }
    List<Integer> result = new ArrayList<>();
    for(int i = 0 ; i < privacies.length ; i++) {
      String privacy = privacies[i];
      int pri_day = parseDay(privacy.split(" ")[0]);
      String intervalKey = privacy.split(" ")[1];
      int max_day = pri_day + (interval.get(intervalKey) * 28);
      if (cur_day >= max_day) {
        result.add(i + 1);
      }
    }

    int[] answer = result.stream().mapToInt(i -> i).toArray();
    return answer;
  }
  private int parseDay(String day) {
    String[] splitToday = day.replace("\"", "").split("\\.");
    return Integer.parseInt(splitToday[0]) * (12 * 28) + Integer.parseInt(splitToday[1]) * 28 + Integer.parseInt(splitToday[2]);
  }
}