class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int n = myString.lastIndexOf(pat);
        System.out.print(n);
        answer = myString.substring(0, n+pat.length());
        return answer;
    }
}