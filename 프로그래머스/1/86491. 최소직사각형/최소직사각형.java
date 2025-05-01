class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = 0;
        int min = 0;
        for (int[] size : sizes) {
            int one = Math.max(size[0],size[1]);
            int two = Math.min(size[0],size[1]);
            max = Math.max(max, one);
            min = Math.max(min, two);
        }
        answer = max*min;
        return answer;
    }
}