class Solution {
    public String[] solution(String[] picture, int k) {
        int a = picture.length;
        int b = picture[0].length();
        String[] answer = new String[a * k];
        
        for (int i=0; i<a; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j=0; j<b; j++) {
                for (int s=0; s<k; s++) {
                    sb.append(picture[i].charAt(j));
                }
            }
            String expand = sb.toString();
            for (int p = 0; p < k; p++) {
                answer[i * k + p] = expand;
            }
        }
        return answer;
    }
}