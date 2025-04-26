class Solution {
    public int solution(String s) {
        int answer = 0;
        int yes = 0;
        int no = 0;
        char ch = ' ';
        for (int i=0; i<s.length(); i++) {
            if (yes==0&&no==0)
                ch=s.charAt(i);
            if (ch==s.charAt(i)) {
                yes++;
            } else {
                no++;
            }
            if (yes==no) {
                answer++;
                yes=0;
                no=0;
            }
        }
        if (!(yes==0&&no==0))
            answer++;
        return answer;
    }
}