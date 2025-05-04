import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (String term : terms) {
            String[] str = term.split(" ");
            map.put(str[0],Integer.valueOf(str[1]));
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate todayDate = LocalDate.parse(today, formatter);
        for (int i=0; i<privacies.length; i++) {
            String p = privacies[i];
            String[] str = p.split(" ");
            int num = map.get(str[1]);
            LocalDate collectionDate = LocalDate.parse(str[0], formatter);
            LocalDate newDate = collectionDate.plusMonths(num);
            if (newDate.isBefore(todayDate) || newDate.isEqual(todayDate))
                list.add(i+1);
        }
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}