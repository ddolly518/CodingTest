import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int len = citations.length;
        Arrays.sort(citations);
        for (int i=0; i<len; i++) {
            if ((len-i)<=citations[i])
                return len-i;
        }
        return answer;
    }
}