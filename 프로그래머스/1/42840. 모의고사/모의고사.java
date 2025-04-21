import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[][] arr = {one, two, three};
        int[] count = {0,0,0};
        for (int i=0; i<answers.length; i++) {
            if (one[i%one.length]==answers[i]) {
                count[0]++;
            }
            if (two[i%two.length]==answers[i]) {
                count[1]++;
            }
            if (three[i%three.length]==answers[i]) {
                count[2]++;
            }
        }
        List<Integer> list = new ArrayList<>();
        if (count[0]>count[1]) {
            if (count[0]==count[2]) {
                list.add(1);
                list.add(3);
            } else if (count[0]>count[2]) {
                list.add(1);
            } else {
                list.add(3);
            }
        } else if (count[0]<count[1]) {
            if (count[1]==count[2]) {
                list.add(2);
                list.add(3);
            } else if (count[1]>count[2]) {
                list.add(2);
            } else {
                list.add(3);
            }
        } else {
            if (count[0]==count[2]) {
                list.add(1);
                list.add(2);
                list.add(3);
            } else if (count[0]>count[2]) {
                list.add(1);
                list.add(2);
            } else {
                list.add(3);
            }
        }
        int[] answer = new int[list.size()];
        int index = -1;
        for (int n:list) {
            answer[++index] = n;
        }
        return answer;
    }
}