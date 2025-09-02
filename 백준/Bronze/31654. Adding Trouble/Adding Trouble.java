import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long c = sc.nextLong();
        long sum = a+b;
        if (c==sum) {
            System.out.println("correct!");
        } else {
            System.out.println("wrong!");
        }
    }
}