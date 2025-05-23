import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new HashSet<>();
        for (int i = 2; i * i <= n; i++) {
            while(n%i==0) {
                n/=i;
                set.add(i);
            }
        }
        if(n>1) {
            set.add(n);
        }
        int[] answer = new int[set.size()];
        int index=0;
        for (int num:set) {
            answer[index++]=num;
        }
        Arrays.sort(answer); 
        return answer;
    }
}