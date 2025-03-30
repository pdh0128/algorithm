import java.util.*;

public class Solution {
  public int[] solution(int []arr) {
    Stack<Integer> stack = new Stack<>();
    Queue<Integer> queue = new LinkedList<>();
    for(int i = 0; i < arr.length; ++i) {
      if (!stack.isEmpty() && stack.peek() == arr[i]) continue;
      stack.push(arr[i]);
      queue.offer(arr[i]);
    }
    int[] answer = new int[queue.size()];
    int qSize = queue.size();
    for(int i = 0; i < qSize; ++i) {
      answer[i] = queue.poll();
    }
    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    return answer;
  }
}