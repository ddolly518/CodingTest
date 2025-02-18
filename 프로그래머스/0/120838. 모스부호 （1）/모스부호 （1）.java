class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] let = letter.split(" ");
        for(String str : let) {
            for (int i=0; i<arr.length; i++) {
                if (str.equals(arr[i])) {
                    answer+=(char)(i+'a');
                }
            }
        }
        return answer;
    }
}