class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        for (int i=0; i<my_string.length(); i++) {
            Boolean b = true;
            for (int num : indices) {
                if (i==num)
                    b = false;
            }
            if (b)
                answer+=String.valueOf(my_string.charAt(i));
        }
        return answer;
    }
}