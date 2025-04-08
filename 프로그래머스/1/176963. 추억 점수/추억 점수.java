class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int index = 0;
        for (String[] str : photo) {
            int sum = 0;
            for (int i=0; i<str.length; i++) {
                String s = str[i];
                for (int k=0; k<name.length; k++) {
                    if (s.equals(name[k]))
                        sum+=yearning[k];
                }
            }
            answer[index++]=sum;
        }
        return answer;
    }
}