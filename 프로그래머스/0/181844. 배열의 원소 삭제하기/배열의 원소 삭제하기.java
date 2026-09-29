import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int n : delete_list)
            list.add(n);
        for (int i=0; i<arr.length; i++) {
            if (!list.contains(arr[i]))
                list2.add(arr[i]);
        }
        answer = new int[list2.size()];
        for (int i=0; i<list2.size(); i++) {
            answer[i] = list2.get(i);
        }
        return answer;
    }
}