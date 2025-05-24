import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int len = order.length;
        Stack<Integer> stack = new Stack<>();
        int index = 0; // order[index] 꺼내야 되는 상자
        int count = 1; // 컨네이너에서 나오는 상자
        while (count<=len) {
            int num = order[index];
            if (num==count) {
                answer++;
                index++;
                count++;
            } else if (!stack.isEmpty() && num==stack.peek()) {
                stack.pop();
                index++;
                answer++;
            } else {
                stack.push(count);
                count++;
            }
            while (!stack.isEmpty() && index < len && stack.peek() == order[index]) {
                stack.pop();
                index++;
                answer++;
            }
        }
        
        return answer;
    }
}