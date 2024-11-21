import java.util.*;
class Solution {
    public int[] solution(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i=k; i<=n; i+=k) {
            list.add(i);
        }
        int[] answer = new int[list.size()];
        int index = 0;
        for (int num : list) {
            answer[index++] = num;
        }
        return answer;
    }
}