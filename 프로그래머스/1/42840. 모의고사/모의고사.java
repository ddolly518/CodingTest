import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] ones = {1, 2, 3, 4, 5};
        int[] twos = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] threes = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int one = 0;
        int two = 0;
        int three = 0;
        for (int i=0; i<answers.length; i++) {
            if (answers[i]==ones[i%ones.length])
                one++;
            if (answers[i]==twos[i%twos.length])
                two++;
            if (answers[i]==threes[i%threes.length])
                three++;
        }
        int max = 0;
        int count = 0;
        max = Math.max(one,two);
        max = Math.max(max, three);
        if (max==one)
            count++;
        if (max==two)
            count++;
        if (max==three)
            count++;
        int index = 0;
        int[] answer = new int[count];
        if (max==one)
            answer[index++]=1;
        if (max==two)
            answer[index++]=2;
        if (max==three)
            answer[index++]=3;
        Arrays.sort(answer);
        return answer;
    }
}