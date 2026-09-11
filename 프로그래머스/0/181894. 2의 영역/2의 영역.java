class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int start = -1;
        int end = -1;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 2) {
                if (start < 0) 
                    start = i;
                end = i;
            }
        }
        if (start < 0 || end < 0)
            return new int[]{-1};
        else {
            answer = new int[end-start+1];
            int index = 0;
            for (int i=start; i<=end; i++) {
                answer[index++] = arr[i];
            }
        }
        return answer;
    }
}