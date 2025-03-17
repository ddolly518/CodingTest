import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        while (n>=3) {
            int temp = n%3;
            list.add(temp);
            n/=3;
        }
        list.add(n);
        int[] arr = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            arr[i]=list.get(i);
        }
        int index=0;
        for (int i=arr.length-1; i>=0; i--) {
            double temp = arr[i]*(Math.pow(3,index));
            answer+=temp;
            index++;
        }
        return answer;
    }
}