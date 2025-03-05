class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int a = x;
        int num = 0;
        while (a>0) {
            num+=(a%10);
            a/=10;
        }
        if (x%num!=0)
            answer=false;
        return answer;
    }
}