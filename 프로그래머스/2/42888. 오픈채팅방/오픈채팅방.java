import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        int count = 0;
        Map<String, String> map = new HashMap<>();
        for (int i=0; i<record.length; i++) {
            String str = record[i];
            String[] arr = str.split(" ");
            if (!arr[0].equals("Leave")) {
                map.put(arr[1], arr[2]);
            }
            if (!arr[0].equals("Change")) 
                count++;
        }
        String[] answer = new String[count];
        int index = 0;
        for (int i=0; i<record.length; i++) {
            String str = record[i];
            String[] arr = str.split(" ");
            if (arr[0].equals("Enter")) {
                answer[index] = map.get(arr[1]) + "님이 들어왔습니다.";
                index++;
            } else if (arr[0].equals("Leave")) {
                answer[index] = map.get(arr[1]) + "님이 나갔습니다.";
                index++;
            }
        }
        return answer;
    }
}