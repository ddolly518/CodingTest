import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        s+=s;
        int index = 0;
        for (int i=0; i<len; i++) {
            Stack<Character> stack = new Stack<>();
            for (int j=0; j<len; j++) {
                char ch = s.charAt(index+j);
                if (stack.isEmpty()) {
                    stack.add(ch);
                } else if (stack.peek()=='(' && ch==')') {
                    stack.pop();
                } else if (stack.peek()=='{' && ch=='}') {
                    stack.pop();
                } else if (stack.peek()=='[' && ch==']') {
                    stack.pop();
                } else {
                    stack.add(ch);
                }
            }
            if (stack.isEmpty()) {
                answer++;
            }
            index++;
        }
        return answer;
    }
}