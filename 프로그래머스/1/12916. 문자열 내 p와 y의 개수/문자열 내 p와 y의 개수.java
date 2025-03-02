class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        for (char ch : s.toCharArray()) {
            ch = Character.toLowerCase(ch);
            if (ch=='p')
                p++;
            else if (ch=='y')
                y++;
        }
        if (p!=y)
            answer=false;

        return answer;
    }
}