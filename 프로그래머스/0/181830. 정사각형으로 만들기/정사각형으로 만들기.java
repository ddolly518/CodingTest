import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        int len = Math.max(arr.length, arr[0].length);
        answer = new int[len][len];
        
        for (int i = 0; i < arr.length; i++) {
            answer[i] = Arrays.copyOf(arr[i], len);
        }
        
        return answer;
    }
}