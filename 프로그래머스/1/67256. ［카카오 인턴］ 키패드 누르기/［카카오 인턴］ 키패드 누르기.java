class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] arr = {{3,1},{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2}};
        int[] left = {3,0};
        int[] right = {3,2};
        StringBuilder sb = new StringBuilder();
        for (int num : numbers) {
            if (num==1 || num==4 || num==7) {
                sb.append("L");
                left = arr[num];
            } else if (num==3 || num==6 || num==9) {
                sb.append("R");
                right = arr[num];
            } else {
                int diff_l = Math.abs(arr[num][0]-left[0]) + Math.abs(arr[num][1]-left[1]);
                int diff_r = Math.abs(arr[num][0]-right[0]) + Math.abs(arr[num][1]-right[1]);
                if (diff_l < diff_r) {
                    sb.append("L");
                    left = arr[num];
                } else if (diff_l > diff_r) {
                    sb.append("R");
                    right = arr[num];
                } else {
                    if (hand.equals("right")) {
                        sb.append("R");
                        right = arr[num];
                    } else {
                        sb.append("L");
                        left = arr[num];
                    }
                }
            }
        }
        answer = sb.toString();
        return answer;
    }
}