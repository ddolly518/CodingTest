import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()-1;
        int answer = 0;
        while (n>0) {
            n-=(6*answer);
            answer++;
        }
        System.out.println((answer==0)?1:answer);
    }
}