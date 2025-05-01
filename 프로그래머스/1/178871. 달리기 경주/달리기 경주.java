import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<String, Integer> map = new HashMap<>();
        int index = 0;
        for (String player : players) {
            map.put(player, index++);
        }
        for (String calling : callings) {
            int num = map.get(calling);
            String n = players[num-1];
            
            players[num] = n;
            players[num-1] = calling;
            
            map.put(calling, num-1);
            map.put(n, num);
        }
        for (int i=0; i<players.length; i++) {
            answer[i]=players[i];
        }
        return answer;
    }
}