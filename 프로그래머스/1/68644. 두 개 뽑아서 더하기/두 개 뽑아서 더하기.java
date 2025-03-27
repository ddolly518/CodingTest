import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<numbers.length-1; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }
        Integer[] integerArray = set.toArray(new Integer[0]);
        Arrays.sort(integerArray);
        int[] answer = new int[integerArray.length];
        for (int i=0; i<integerArray.length; i++) {
            answer[i]=integerArray[i];
        }
        return answer;
    }
}