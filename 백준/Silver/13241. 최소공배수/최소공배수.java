import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long answer = a*b;
        while (b!=0) {
            long temp = b;
            b = a%b;
            a = temp;
        }
        System.out.println(answer/a);
    }
}