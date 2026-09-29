import java.util.*;

class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (String str : str_list) {
            if (!str.contains(ex))
                sb.append(str);
        }
        answer = sb.toString();
        return answer;
    }
}