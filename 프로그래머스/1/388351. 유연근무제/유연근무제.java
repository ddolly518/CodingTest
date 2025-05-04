import java.util.*;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int index = 0;
        int len = timelogs.length;
        Map<Integer, Integer> map = new HashMap<>();
        boolean[] bo = new boolean[len];
        Arrays.fill(bo, true);
        for (int i=0; i<len; i++) {
            int num = schedules[i]/100*60+schedules[i]%100+10;
            map.put(index++, num);
        }
        for (int i=0; i<7; i++) {
            int day = (startday+i-1)%7+1;
            if (day==6 || day==7)
                continue;
            for (int j=0; j<len; j++) {
                int time = timelogs[j][i]/100*60+timelogs[j][i]%100;
                if (time>(map.get(j)))
                    bo[j]=false;
            }
            
        }
        for (int i=0; i<len; i++) {
            if (bo[i])
                answer++;
        }
        return answer;
    }
}
