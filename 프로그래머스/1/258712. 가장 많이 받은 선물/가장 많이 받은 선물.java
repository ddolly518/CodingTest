import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        int index = 0;
        int len = friends.length;
        int[][] arr = new int[len][len];
        int[] result = new int[len];
        for (String friend : friends) {
            map.put(friend,index++);
        }
        for (String gift : gifts) {
            String[] str = gift.split(" ");
            arr[map.get(str[0])][map.get(str[1])]++;
        }
        for (int i=0; i<len; i++) {
            for (int j=i; j<len; j++) {
                if (arr[i][j] > arr[j][i]) {
                    result[i]++;
                } else if (arr[i][j] < arr[j][i]) {
                    result[j]++;
                } else {
                    int sum_i = 0;
                    int sum_j = 0;
                    for (int k=0; k<len; k++) {
                        sum_i+=(arr[i][k]-arr[k][i]);
                        sum_j+=(arr[j][k]-arr[k][j]);
                    }
                    if (sum_i<sum_j) {
                        result[j]++;
                    } else if (sum_i>sum_j) {
                        result[i]++;
                    }
                }
            }
        }
        for (int i=0; i<len; i++) {
            answer=Math.max(answer,result[i]);
        }
        return answer;
    }
}