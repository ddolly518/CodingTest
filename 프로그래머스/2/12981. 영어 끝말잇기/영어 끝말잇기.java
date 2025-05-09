import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        int index = 0;
        String temp = "";
        for (String word : words) {
            if (index!=0 && temp.charAt(temp.length()-1)!=word.charAt(0)) {
                answer[0]=(index%n+1);
                answer[1]=(index / n + 1);
                return answer;
            }
            if (list.contains(word)) {
                answer[0]=(index%n+1);
                answer[1]=(index / n + 1);
                return answer;
            }
            temp = word;
            index++;
            list.add(word);
        }
        return answer;
    }
}