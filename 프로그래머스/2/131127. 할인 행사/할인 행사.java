import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int len = discount.length-10;
        boolean bo = true;
        for (int i=0; i<=len; i++) {
            bo = true;
            Queue<String> queue = new LinkedList<>();
            for (int j=i; j<i+10; j++) {
                queue.offer(discount[j]);
            } 
            for (int j=0; j<want.length; j++) {
                String s = want[j];
                int sum = 0;
                for (String q : queue) {
                    if (s.equals(q))
                        sum++;
                }
                if (sum<number[j])
                    bo = false;
            }
            if (bo) 
                answer++;
        }
        return answer;
    }
}