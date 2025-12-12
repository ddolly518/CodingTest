import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 운동 시간
        int m = sc.nextInt(); // 최초 맥박. 초기 맥박
        int M = sc.nextInt(); // 최대 맥박
        int T = sc.nextInt(); // 운동 증가
        int R = sc.nextInt(); // 휴식 감소
        
        int num = m;
        int n = 0;
        int count = 0;
        
        if (num+T>M) {
            System.out.print(-1);
            return;
        }
        
        while (n<N) {
            if (num+T<=M) {
                num+=T;
                n++;
            } else {
                num = Math.max(m, num-R);
            }
            count++;
        }
        
        System.out.print(count);
    }
}