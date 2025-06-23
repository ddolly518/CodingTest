import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = String.valueOf(n).length();
        int start = Math.max(1, n - len * 9);
        int answer = 0;
        for (int i=start; i<n; i++) {
            int num = i;
            int count = i;
            while (num>0) {
                count+=(num%10);
                num/=10;
            }
            if (count==n) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}