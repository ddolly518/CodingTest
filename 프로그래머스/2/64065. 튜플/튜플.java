import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.replaceAll("^\\{\\{","").replaceAll("}}$","");
        
        String[] str = s.split("},\\{");
        Arrays.sort(str,(a,b)->Integer.compare(a.length(), b.length()));
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<str.length; i++) {
            String n = str[i];
            String[] num = n.split(",");
            for (int j=0; j<num.length; j++) {
                int count = Integer.parseInt(num[j]);
                if (!list.contains(count)) {
                    list.add(count);
                }
            }
        }
        int[] answer = new int[list.size()];
        int index = 0;
        for (int num : list) {
            answer[index++]=num;
        }
        return answer;
    }
}