class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int num = 0;
        while ((int)Math.pow(2,num) < arr.length) {
            num++;
        }
        answer = new int[(int)Math.pow(2,num)];
        for (int i=0; i<arr.length; i++) {
            answer[i] = arr[i];
        }
        for (int i=arr.length; i<(int)Math.pow(2,num); i++) {
            answer[i] = 0;
        }
        return answer;
    }
}