class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        
        B=B.repeat(2);
        return B.indexOf(A);
        //return -1;
    }
}