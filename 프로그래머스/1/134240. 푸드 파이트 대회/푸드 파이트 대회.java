import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        List<String> list = new ArrayList<>();
        for (int i=1; i<food.length; i++) {
            int len = food[i]/2;
            for (int j=0; j<len; j++) {
                list.add(i+"");
            }
        }
        for (int i=0; i<list.size(); i++) {
            answer+=list.get(i);
        }
        answer+="0";
        Collections.reverse(list);
        for (int i=0; i<list.size(); i++) {
            answer+=list.get(i);
        }
        return answer;
    }
}