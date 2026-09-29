class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        int index = 0;
        for (int i=0; i<picture.length; i++) {
            String str = picture[i];
            StringBuilder sb = new StringBuilder();
            for (char ch : str.toCharArray()) {
                for (int j=0; j<k; j++) {
                    sb.append(ch);
                }
            }
            for (int j=0; j<k; j++) {
                answer[index++] = sb.toString();
            }
        }
        return answer;
    }
}