class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int c = Integer.parseInt(""+a+b);
        answer = (c >= 2*a*b) ? c : 2*a*b;
        return answer;
    }
}