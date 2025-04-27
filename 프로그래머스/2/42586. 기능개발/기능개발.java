import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i=0; i<progresses.length; i++) {
            int count = (100-progresses[i])/speeds[i];
            count = (100-progresses[i])%speeds[i]==0?count:count + 1;
            queue.add(count);
        }
        while (!queue.isEmpty()) {
            int count = 1;
            int num = queue.poll();
            
            while (!queue.isEmpty() && queue.peek() <= num) {
                queue.poll();
                count++;
            }
            
            list.add(count);
        }
        int[] answer = new int[list.size()];
        int index = 0;
        for (int num : list) {
            answer[index++] = num;
        }
        return answer;
    }
}