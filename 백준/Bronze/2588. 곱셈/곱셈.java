import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int answer = A*B;
        for (int i=0; i<3; i++) {
            int num = B%10;
            System.out.println(A*num);
            B/=10;
        }
        System.out.println(answer);
    }
}