class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        if (A.equals(B))
            return 0;
        A=A.repeat(2);
        for (int i=0; i<A.length()/2; i++) {
            if (B.equals(A.substring(A.length()/2-i,A.length()-i)))
                return answer;
            answer++;
        }
        return -1;
    }
}