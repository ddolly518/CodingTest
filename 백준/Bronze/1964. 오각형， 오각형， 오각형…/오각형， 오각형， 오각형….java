import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 5;
        long num = 7;
        long answer = 0;
        
        for (int i=1; i<n; i++) {
            sum+=num;
            num+=3;
        }
        if (n==1) {
            answer = 5;
        } else {
            answer = sum % 45678;
        }
        System.out.println(answer);
    }
}