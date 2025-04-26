import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for (int num : arr) {
            if (stack.isEmpty())
                stack.push(num);
            else if (stack.peek()!=num) {
                stack.push(num);
            }
        }
        int[] answer = new int[stack.size()];
        int i=0;
        for (int num : stack) {
            answer[i++]=num;
        }
        return answer;
    }
}