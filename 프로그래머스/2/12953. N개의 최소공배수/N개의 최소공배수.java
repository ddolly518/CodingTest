class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int num = 0;
        for (int i=0; i<arr.length-1; i++) {
            if (i==0) {
                num = arr[i];
            } else {
                num = answer;
            }
            int num2 = arr[i+1];
            answer = Math.abs(num*num2);
            while (num2!=0) {
                int temp = num2;
                num2 = num%num2;
                num = temp;
            }
            answer /= num;            
        }
        return answer;
    }
}