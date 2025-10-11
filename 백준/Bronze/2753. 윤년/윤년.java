import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = -1;
        
        if (num%4==0 && (num%100!=0 || num%400==0)) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        System.out.print(answer);
    }
}