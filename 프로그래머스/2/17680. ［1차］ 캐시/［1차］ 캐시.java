import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> queue = new LinkedList<>();
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        for (String c : cities) {
            String str = c.toLowerCase();
            if (queue.contains(str)) {
                queue.remove(str);
                answer++;
            } else {
                answer+=5;
                if (queue.size()==cacheSize) {
                    queue.poll();
                }
            }
            queue.add(str);
        }
        return answer;
    }
}