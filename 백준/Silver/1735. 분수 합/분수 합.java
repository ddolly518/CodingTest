import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int a = a1*b2+a2*b1;
        int b = b1*b2;
        int num = gcd(a,b);
        System.out.print(a/num+" "+b/num);
    }
    private static int gcd(int a, int b) {
        while (b!=0) {
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
}