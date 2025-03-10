class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int index = 0;
        for (String str : quiz) {
            String[] arr = str.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[2]);
            int c = Integer.parseInt(arr[4]);
            String q = arr[1];
            if (q.equals("+")) {
                if ((a+b)==c) {
                    answer[index]="O";
                } else {
                    answer[index]="X";
                }
            } else {
                if ((a-b)==c) {
                    answer[index]="O";
                } else {
                    answer[index]="X";
                }
            }
            index++;
        }
        return answer;
    }
}