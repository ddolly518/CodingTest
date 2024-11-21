class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        String a = "";
        if (n > m) {
            a = ">";
        } else if (n < m) {
            a = "<";
        } else {
            a = "=";
        }
        if (n!=m)
            answer = (ineq.equals(a)) ? 1 : 0;
        else
            answer = (eq.equals(a)) ? 1 : 0;
        return answer;
    }
}