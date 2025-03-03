class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for(String[] d : db) {
            if (d[0].equals(id_pw[0])) {
                if (d[1].equals(id_pw[1])) {
                    answer="login";
                    return answer;
                } else {
                    answer="wrong pw";
                    return answer;
                }
            } else {
                answer = "fail";
            }
        }
        return answer;
    }
}