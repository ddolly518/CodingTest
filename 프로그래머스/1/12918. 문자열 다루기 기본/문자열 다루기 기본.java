class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        boolean A = true;
        boolean B = false;
        for (char ch:s.toCharArray()) {
            if (!Character.isDigit(ch))
                A = false;
        }
        if (s.length()==4||s.length()==6)
            B = true;
        if (A&&B)
            answer = true;
        return answer;
    }
}