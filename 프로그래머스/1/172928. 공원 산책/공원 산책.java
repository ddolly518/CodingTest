import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        Map<String, int[]> map = new HashMap<>();
        String[][] arr = new String[park.length][park[0].length()];
        map.put("E", new int[]{0,1});
        map.put("W", new int[]{0,-1});
        map.put("S", new int[]{1,0});
        map.put("N", new int[]{-1,0});
        
        boolean bo = true;
        int x = 0;
        int y = 0;
        int dx = 0;
        int dy = 0;
        int index1 = 0;
        for (String p : park) {
            String[] str = p.split("");
            int index = 0;
            for (String s : str) {
                if (s.equals("S")) {
                    x=index1;
                    y=index;
                }
                arr[index1][index++]=s;
            }
            index1++;
        }
        for (String route : routes) {
            bo = true;
            String[] str = route.split(" ");
            int num = Integer.valueOf(str[1]);
            for (int i=1; i<=num; i++) {
                dx = x + (map.get(str[0]))[0]*i;
                dy = y + (map.get(str[0]))[1]*i;
                if (dx<0 || dy<0 || dx>=park.length || dy>=park[0].length() || arr[dx][dy].equals("X")) {
                    bo = false;
                    break;
                }    
            }
            if (bo) {
                x+=map.get(str[0])[0] * num;
                y+=map.get(str[0])[1] * num;
            }
        }
            
        answer[0]=x;
        answer[1]=y;
        return answer;
    }
}