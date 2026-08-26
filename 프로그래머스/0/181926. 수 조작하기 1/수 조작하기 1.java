class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        for (char ch : control.toCharArray()) {
            if (ch == 'w') n++;
            else if (ch == 's') n--;
            else if (ch == 'd') n+=10;
            else if (ch == 'a') n-=10;
        }
        answer = n;
        return answer;
    }
}