import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(factory(n));
    }
    private static long factory(int n) {
        if (n<2) return 1;
        return n*factory(n-1);
    }
}