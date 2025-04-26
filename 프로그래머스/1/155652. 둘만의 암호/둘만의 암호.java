class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        int count = 0;
        char c = ' ';
        for (char ch : s.toCharArray()) {
            count = 0;
            c = ch;
            for (int i=0; i<index; i++) {
                c++;
                if (c>'z')
                    c=(char)((c-'a')%26+'a');
                while (skip.contains(String.valueOf(c))) {
                    c++;
                    if (c>'z')
                        c=(char)((c-'a')%26+'a');
                }
            }
            answer+=c;
        }
        return answer;
    }
}