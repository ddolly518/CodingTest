class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int l = pat.length();
        for (int i=0; i<myString.length()-l+1; i++) {
            if (pat.equals(myString.substring(i,i+l)))
                answer++;
        }
        return answer;
    }
}