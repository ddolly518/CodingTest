class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int a = 0;
        int b = 0;
        for (int[] size : sizes) {
            a=(Math.max(size[0],size[1])>a)?Math.max(size[0],size[1]):a;
            b=(Math.min(size[0],size[1])>b)?Math.min(size[0],size[1]):b;
        }
        answer = a*b;
        return answer;
    }
}