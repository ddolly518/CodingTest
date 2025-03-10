import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int len = numlist.length;
        int[] answer = new int[len];
        int[][] arr = new int[len][2];
        for (int i=0; i<len; i++) {
            arr[i][0] = Math.abs(numlist[i]-n);
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> {
            int diff = Integer.compare(a[0], b[0]);
            if (diff==0) {
                return Integer.compare(numlist[b[1]],numlist[a[1]]);
            }
            return diff;
        });
        for (int i=0; i<len; i++) {
            answer[i]=numlist[arr[i][1]];
        }
        return answer;
    }
}