class Solution {
    public int solution(int storey) {
        int answer = 0;
        while (storey!=0) {
            int n = storey%10;
            int num = storey/10%10;
            if (n>5) {
                answer+=(10-n);
                storey+=(10-n);
            } else if (n==5) {
                if(num>=5) {
                    answer+=(10-n);
                    storey+=(10-n);
                } else {
                    answer+=n;
                    storey-=n;
                }
            } else {
                answer+=n;
                storey-=n;
            }
            storey/=10;
        }
        return answer;
    }
}
