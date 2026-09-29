import java.util.*;

class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        List<String> list = new ArrayList<>();
        for (int i=0; i<my_string.length()-1; i++) {
            for (int j=i+1; j<my_string.length(); j++) {
                list.add(my_string.substring(i,j+1));
            }
        }
        answer = list.contains(target) ? 1 : 0;
        return answer;
    }
}