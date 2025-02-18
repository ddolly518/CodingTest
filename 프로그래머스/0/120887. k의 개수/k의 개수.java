class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        int b = 0;
        for (int a=i; a<=j; a++) {
            b = a;
            while(b!=0) {
                int c = b%10;
                b/=10;
                if (c==k)
                    answer++;
            }
        }
        return answer;
    }
}