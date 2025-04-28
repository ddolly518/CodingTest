import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        
        // X에서 숫자의 등장 횟수 카운트
        for (char ch : X.toCharArray()) {
            int num = ch - '0';
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Y에서 숫자의 등장 횟수 카운트
        for (char ch : Y.toCharArray()) {
            int num = ch - '0';
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }

        // 공통된 숫자들을 최대한 많이 추가
        for (int i = 9; i >= 0; i--) { // 내림차순으로 큰 수부터 처리
            int count = Math.min(map.getOrDefault(i, 0), map2.getOrDefault(i, 0));
            for (int j = 0; j < count; j++) {
                answer.append(i);
            }
        }

        // 결과가 비어있으면 -1 반환
        if (answer.length() == 0) {
            return "-1";
        }

        // "0"만 있을 경우 "0"을 반환
        if (answer.charAt(0) == '0') {
            return "0";
        }

        return answer.toString();
    }
}
