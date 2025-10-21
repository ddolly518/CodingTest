import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = Integer.MAX_VALUE;
        
        int count = N/5;
        for (int i=count; i>=0; i--) {
            int num = N-i*5;
            if (num%3==0) {
                int sum = (i+num/3);
                answer = Math.min(answer,sum);
            }
        }
        
        answer = (answer==Integer.MAX_VALUE)?-1:answer;
        System.out.print(answer);
    }
}