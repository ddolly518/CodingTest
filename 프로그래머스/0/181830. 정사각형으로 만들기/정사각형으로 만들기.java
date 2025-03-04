class Solution {
    public int[][] solution(int[][] arr) {
        int len = arr[0].length;
        int height = arr.length;
        if (height<len) {
            int[][] answer = new int[len][len];
            for (int i=0; i<len; i++) {
                for (int j=0; j<len; j++) {
                    if (i>=height) {
                        answer[i][j] = 0;
                    } else {
                        answer[i][j]=arr[i][j];
                    }
                }
            }
            return answer;
        } else {
            int[][] answer = new int[height][height];
            for (int i=0; i<height; i++) {
                for (int j=0; j<height; j++) {
                    if (j>=len) {
                        answer[i][j] = 0;
                    } else {
                        answer[i][j]=arr[i][j];
                    }
                }
            }
            return answer;
        }
    }
}