import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<intervals.length; i++) {
            int[] interval = intervals[i];
            for (int j=interval[0]; j<=interval[1]; j++) {
                list.add(arr[j]);
            }
        }
        answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}