class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        int a1 = a;
        int b1 = b;
        while (b1!=0) {
            int temp = b1;
            b1 = a1%b1;
            a1 = temp;
        }
        int num = b/a1;
        while (num%2==0) {
            num/=2;
        }
        while (num%5==0) {
            num/=5;
        }
        answer = (num==1)?1:2;
        return answer;
    }
}