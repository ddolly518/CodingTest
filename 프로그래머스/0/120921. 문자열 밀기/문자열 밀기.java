class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        String str = B.repeat(3);
        /*for (int i=0; i<A.length(); i++) {
            int num = A.length()-i;
            if (B.equals(str.substring(num, num+A.length())))
                return i;
        }
        return answer;*/
        return str.indexOf(A);
    }
}