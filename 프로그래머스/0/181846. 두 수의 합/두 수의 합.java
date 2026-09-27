import java.math.BigDecimal;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigDecimal numA = new BigDecimal(a);
        BigDecimal numB = new BigDecimal(b);

        answer = numA.add(numB).toString();
        return answer;
    }
}