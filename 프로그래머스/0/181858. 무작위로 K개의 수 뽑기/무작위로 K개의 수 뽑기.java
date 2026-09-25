import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Set<Integer> set = new HashSet<>();
        int index = 0;
        
        for (int n : arr) {
            if (!set.contains(n) && index < k) {
                set.add(n);
                answer[index++] = n;
            }
        }
        
        while (index < k) {
            answer[index++] = -1;
        }
        return answer;
    }
}