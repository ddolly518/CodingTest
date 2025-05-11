class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int len2 = arr1.length;
        int len = arr1[0].length;
        int[][] answer = new int[len2][arr2[0].length];
        for (int i=0; i<len2; i++) {
            for (int k=0; k<arr2[0].length; k++) {
                int sum = 0;
                for (int j=0; j<len; j++) {
                    sum+=(arr1[i][j]*arr2[j][k]);
                }
                answer[i][k]=sum;
            }
        }
        return answer;
    }
}