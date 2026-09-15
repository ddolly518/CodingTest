import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] num = arr.clone();
        
        while (true) {
            for (int i=0; i<arr.length; i++) {
                int n = num[i];
                if (n >= 50 && n%2 == 0) {
                    n/=2;
                } else if (n < 50 && n%2 == 1) {
                    n = 2*n+1;
                }
                num[i] = n;
            }
            if (Arrays.equals(arr, num)) {
                break;
            } else {
                answer++;
                arr = num.clone();
            }
        }
        return answer;
    }
}