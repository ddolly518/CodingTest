class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int num1 = 1;
        int num2 = 0;
        for (int num : num_list) {
            num1*=num;
            num2+=num;
        }
        answer = (num1 < Math.pow(num2, 2)) ? 1 : 0;
        return answer;
    }
}