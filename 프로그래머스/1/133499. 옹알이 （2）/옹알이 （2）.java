class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        int index = 0;
        String[] arr = new String[babbling.length];
        for (String b : babbling) {
            StringBuilder sb = new StringBuilder(b);
            String prev = "";
            while (sb.length()!=0) {
                if ((sb.toString()).startsWith("aya") && !prev.equals("aya")) {
                    prev = "aya";
                    sb = sb.delete(0,3);
                }
                else if ((sb.toString()).startsWith("woo") && !prev.equals("woo")) {
                    prev = "woo";
                    sb = sb.delete(0,3);
                }
                else if ((sb.toString()).startsWith("ye") && !prev.equals("ye")) {
                    prev = "ye";
                    sb = sb.delete(0,2);
                }
                else if ((sb.toString()).startsWith("ma") && !prev.equals("ma")) {
                    prev = "ma";
                    sb = sb.delete(0,2);
                }
                else 
                    break;
            }
            arr[index++] = sb.toString();
        }
        for (int i=0; i<babbling.length; i++) {
            if (arr[i].isEmpty())
                answer++;
        }
        return answer;
    }
}