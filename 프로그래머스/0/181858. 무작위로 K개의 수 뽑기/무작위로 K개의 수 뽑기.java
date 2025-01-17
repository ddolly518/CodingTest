import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        int i=0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (!map.containsKey(num)) {
                map.put(num, map.getOrDefault(num,0)+1);
                if (i < k) {
                    answer[i++]=num;
                }
            }
        }
        return answer;
    }
}