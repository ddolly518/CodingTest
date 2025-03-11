class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (String str : babbling) {
            while (!str.equals("")) {
                if(str.startsWith("aya")||str.startsWith("woo")) {
                    str=str.substring(3);
                } else if (str.startsWith("ye") || str.startsWith("ma")) {
                    str=str.substring(2);
                } else {
                    break;
                }
            }
            if (str.equals("")) answer++;
        }
        return answer;
    }
}