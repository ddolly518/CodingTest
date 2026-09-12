import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int[] one = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] two = Arrays.copyOfRange(num_list, 0, n);
        for (int i=0; i<num_list.length; i++) {
            if (i < one.length) {
                answer[i] = one[i];
            } else {
                answer[i] = two[i - one.length];
            }
        }
        return answer;
    }
}