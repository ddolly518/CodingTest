class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int correct = 0;
        int count = 0;
        for (int n : lottos) {
            if (n==0)
                count++;
            for (int num : win_nums) {
                if (num==n)
                    correct++;
                
            }
        }
        answer[0]=lotto(correct+count);
        answer[1]=lotto(correct);
        return answer;
    }
    public int lotto(int num) {
        int n = 0;
        switch (num) {
            case 6-> n=1;
            case 5-> n=2;
            case 4-> n=3;
            case 3-> n=4;
            case 2-> n=5;
            case 1-> n=6;
            case 0-> n=6;
        }
        return n;
    }
}