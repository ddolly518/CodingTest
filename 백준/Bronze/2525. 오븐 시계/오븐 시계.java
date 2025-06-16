import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int num = A*60+B+C;
        int n = num/60>23?num/60-24:num/60;
        System.out.println(n+" "+num%60);
    }
}