import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int min = arr.length;
        int max = -1;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==2) {
                if (i < min) {
                    min = i;
                } else if (i > max) {
                    max = i;
                }
            }
        }
        if (min == arr.length) {
            list.add(max);
        } else if (max == -1) {
            list.add(arr[min]);
        } else {
            for (int i=min; i<=max; i++) {
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}