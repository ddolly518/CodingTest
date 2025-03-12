class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        int count = 0;
        StringBuilder sb = new StringBuilder(A);
        if (A.equals(B))
            return 0;
        for (int i=0; i<A.length(); i++) {
            Character temp = sb.charAt(A.length()-1);
            for (int j=A.length()-1; j>0; j--) {
                sb.setCharAt(j,sb.charAt(j-1));
            }
            sb.setCharAt(0,temp);
            count++;
            if ((sb.toString()).equals(B))
                return count;
        }
        return answer;
    }
}