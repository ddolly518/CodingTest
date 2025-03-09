class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x1 = dots[0][0];
        int x2 = 0;
        int y1= dots[0][1];
        int y2= 0;
        for (int[] dot:dots) {
            if (x1!=dot[0])
                x2=dot[0];
            if (y1!=dot[1])
                y2=dot[1];
        }
        answer = Math.abs(x2-x1)*Math.abs(y2-y1);
        
        return answer;
    }
}