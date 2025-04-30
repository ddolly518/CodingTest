import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];
        StringBuilder sb = new StringBuilder();
        
        int index = 0;
        for (int num : numbers) {
            arr[index++] = (num+"");
        }
        Arrays.sort(arr,(a,b) -> (b+a).compareTo(a+b));
        for (String str : arr) {
            sb.append(str);
        }
        answer = sb.toString();
        if (answer.charAt(0) == '0') {
            return "0";
        }
        return answer;
    }
}