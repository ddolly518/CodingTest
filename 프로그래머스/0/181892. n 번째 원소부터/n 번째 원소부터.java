import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        for (int i=0; i<num_list.length; i++) {
            answer = Arrays.copyOfRange(num_list, n-1, num_list.length);
        }
        return answer;
    }
}