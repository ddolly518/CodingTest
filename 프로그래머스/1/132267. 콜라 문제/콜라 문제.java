class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n>=a) {
            int num = n/a;
            answer += num*b;
            n-=num*a;
            n+=num*b;
            System.out.println(n+" "+answer);
        }
        return answer;
    }
}