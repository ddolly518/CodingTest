import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int len = elements.length;
        int[] arr = new int[2*len];
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<2*len; i++) {
            arr[i] = elements[i%elements.length];
        }
        
        for (int i=1; i<=len; i++) { // 합할 개수
            int sum = 0;
            for (int j=0; j<len; j++) { // 합 시작 위치
                sum = 0;
                for (int k=0; k<i; k++) {
                    sum+=arr[j+k];
                }
                set.add(sum);
            }
        }
        answer = set.size();
        return answer;
    }
}