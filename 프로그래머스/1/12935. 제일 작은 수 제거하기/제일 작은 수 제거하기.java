class Solution {
    public int[] solution(int[] arr) {
        if (arr.length<=1) {
            return new int[]{-1};
        }
        int[] answer = new int[arr.length-1];
        int min = Integer.MAX_VALUE;
        for (int num:arr) {
            if (min>num)
                min=num;
        }
        int index = 0;
        for (int num:arr) {
            if (num!=min) {
                answer[index++]=num;
            }
        }
        return answer;
    }
}