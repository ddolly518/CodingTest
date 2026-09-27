import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int len = 0;
        int index = 0;
        for (boolean bo : attendance) {
            if (bo)
                len++;
        }
        int[][] arr = new int[len][2];
        for (int i=0; i<rank.length; i++) {
            if (attendance[i]) {
                arr[index][0] = rank[i];
                arr[index][1] = i;
                index++;
            }
        }
        
        Arrays.sort(arr, (a,b) -> {
            return a[0]-b[0];
        });
        answer = arr[0][1]*10000 + arr[1][1]*100 + arr[2][1];
        return answer;
    }
}