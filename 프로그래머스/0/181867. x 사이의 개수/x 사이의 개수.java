import java.util.*;

class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        String[] arr = myString.split("x");
        List<Integer> list = new ArrayList<>();
        
        for (String str : arr) 
            list.add(str.length());
        if (myString.charAt(myString.length()-1) == 'x')
            list.add(0);
        
        answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}