import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        int answer = 0;
        
        for (int i=0; i<N; i++) {
            char ch = str.charAt(i);
            answer += (ch-'0');
        }
        System.out.print(answer);
    }
}