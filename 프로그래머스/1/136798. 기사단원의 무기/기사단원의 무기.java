import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i=2; i<=number; i++) {
            int count = 0;
            for (int j=1; j<=i/2; j++) {
                if (i%j==0) {
                    count++;
                }
            }
            count++;
            list.add(count);
        }
        for (int n : list) {
            if (n>limit) {
                answer+=power;
            } else {
                answer+=n;
            }
        }
        return answer;
    }
}
/* 각 기사 번호의 약수 개수에 해당하는 공격력 무기 구매
제한수치보다 큰 공격력은 협약기관에서 정한 공격력 무기 구매*/