class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String one = String.valueOf(a)+String.valueOf(b);
        String two = String.valueOf(b)+String.valueOf(a);
        int one1 = Integer.parseInt(one);
        int two2 = Integer.parseInt(two);
        answer = one1;
        if (one1 < two2)
            answer = two2;
        return answer;
    }
}