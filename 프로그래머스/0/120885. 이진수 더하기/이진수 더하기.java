class Solution {
    public String solution(String bin1, String bin2) {
        int num = Integer.parseInt(bin1,2)+Integer.parseInt(bin2,2);
        String answer = Integer.toBinaryString(num);
        return answer;
    }
}