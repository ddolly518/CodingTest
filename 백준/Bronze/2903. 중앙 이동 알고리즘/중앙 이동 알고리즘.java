import java.util.Scanner;

public class Main {
    
    static int answer = 2;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            answer = 2*answer-1;
        }
        System.out.print(answer*answer);
    }
}