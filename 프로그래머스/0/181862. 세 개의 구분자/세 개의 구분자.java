import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        String[] str = myStr.split("[abc]");
        List<String> list = new ArrayList<>();
        for (String s : str) {
            if (!s.isEmpty())
                list.add(s);
        }
        if (list.isEmpty()) {
            answer = new String[]{"EMPTY"};
        } else {
            answer = new String[list.size()];
            list.toArray(answer);
        }
        
        return answer;
    }
}