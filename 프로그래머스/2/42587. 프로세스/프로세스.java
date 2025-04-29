import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> queue = new LinkedList<>();
        int index = 0;
        for (int num : priorities) {
            queue.offer(new int[]{index++, num});
        }
        while (!queue.isEmpty()) {
            int[] num = queue.poll();
            boolean bo = true;
            for (int[] q : queue) {
                if (q[1]>num[1]) {
                    bo = false;
                    break;
                }
            }
            if (bo) {
                answer++;
                if (num[0]==location)
                    return answer;
            } else {
                queue.offer(num);
            }
        }
        return answer;
    }
}