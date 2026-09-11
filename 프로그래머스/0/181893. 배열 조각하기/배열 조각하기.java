import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        Deque<Integer> deque = new ArrayDeque<>();
        for (int num : arr) {
            deque.offer(num);
        }
        for (int i=0; i<query.length; i++) {
            if (i%2 == 0) {
                int num = deque.size()-1-query[i];
                for (int j=0; j<num; j++)
                    deque.pollLast();
            } else {
                int num = query[i];
                for (int j=0; j<num; j++) 
                    deque.pollFirst();
            }
        }
        int size = deque.size();
        answer = new int[size];
        for (int i=0; i<size; i++) {
            answer[i] = deque.pollFirst();
        }
        return answer;
    }
}