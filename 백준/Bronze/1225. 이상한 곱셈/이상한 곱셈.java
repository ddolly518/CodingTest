import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        long answer = 0;
        
        for (int i=0; i<A.length(); i++) {
            int n = A.charAt(i)-'0';
            for (int j=0; j<B.length(); j++) {
                int m = B.charAt(j)-'0';
                answer+=((long)n*m);
            }
        }
        
        System.out.print(answer);
    }
}