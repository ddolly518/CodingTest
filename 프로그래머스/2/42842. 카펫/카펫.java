class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int a = 0;
        int b = 0;
        int num = (yellow+brown);
        for (int i=2; i*i<=num; i++) {
            if (num%i==0) {
                a = i;
                b = num/i;
                if (brown==(2*a+2*b-4) && yellow==((a-2)*(b-2))) {
                    answer[0] = b;
                    answer[1] = a;
                    break;
                }
            }
        }
        return answer;
    }
}
