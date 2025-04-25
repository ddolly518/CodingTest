import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> queue = new PriorityQueue<>();
        for (int num : scoville) {
            queue.add(num);
        }
        while (queue.peek()<K && queue.size()>1) {
            int num = queue.poll();
            int num2 = queue.poll();
            int n = num+2*num2;
            queue.add(n);
            answer++;
        }
        if (queue.peek()<K && queue.size()==1)
            answer=-1;
        return answer;
    }
}