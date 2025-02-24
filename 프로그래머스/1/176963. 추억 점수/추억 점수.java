import java.util.*;

class Solution {
  public int[] solution(String[] name, int[] yearning, String[][] photo) {
    return solve(name, yearning, photo);
  }
  public int[] solve(String[] name, int[] yearning, String[][] photo) {
    Map<String, Integer> map = new HashMap<>();
    for(int i = 0; i < name.length; i++) {
      map.put(name[i], yearning[i]);
    }
    int[] resultList = new int[photo.length];
    for(int i = 0; i < photo.length; i++) {
      int result = 0;
      for(String s : photo[i]) {
        if (map.containsKey(s)) {
          result += map.get(s);
        }
      }
      resultList[i] = result;
    }
    return resultList;
  }
}