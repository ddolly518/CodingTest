import java.util.*;
class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        for (char ch : number.toCharArray()) {
            sum+=ch-'0';
        }
        answer = sum%9;
        return answer;
    }
}