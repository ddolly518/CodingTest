import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        System.out.print(lcm(A,B));
    }
    private static long gcd(long a, long b) {
        while (b!=0) {
            long temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
    private static long lcm(long a, long b) {
        return Math.abs(a*b)/gcd(a,b);
    }
}