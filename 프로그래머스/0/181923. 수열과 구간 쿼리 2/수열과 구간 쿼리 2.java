class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i=0; i<queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            int min = Integer.MAX_VALUE;
            boolean bo = false;
            for (int j=s; j<=e; j++) {
                int num = arr[j];
                if (num > k) {
                    min = Math.min(min, num);
                    bo = true;
                }
            }
            if (!bo)
                min = -1;
            answer[i] = min;
        }
        return answer;
    }
}