class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = 0;
        int rdy = 0;
        for (int i=0; i<wallpaper.length; i++) {
            String str = wallpaper[i];
            for (int j=0; j<str.length(); j++) {
                if (str.charAt(j)=='#') {
                    lux = Math.min(lux, i);
                    luy = Math.min(luy, j);
                    rdx = Math.max(rdx, i);
                    rdy = Math.max(rdy, j);
                }
            }
        }
        answer[0] = lux;
        answer[1] = luy;
        answer[2] = rdx+1;
        answer[3] = rdy+1;
        return answer;
    }
}