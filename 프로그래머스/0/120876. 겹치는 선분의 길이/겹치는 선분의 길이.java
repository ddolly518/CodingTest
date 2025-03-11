class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] arr = new int[201];
        for (int[] line:lines) {
            int start = line[0];
            int end = line[1];
            for (int i=start; i<end; i++) {
                arr[i+100]++;
            }
        }
        for (int num:arr) {
            if (num>=2) {
                answer++;
            }
        }
        return answer;
    }
}