import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = 64;
        int answer = 0;
        
        while (n > 0) {
            if (len <= n) {
                n -= len;
                answer++;
            }
            len/=2;
        }
        System.out.println(answer);
    }
}