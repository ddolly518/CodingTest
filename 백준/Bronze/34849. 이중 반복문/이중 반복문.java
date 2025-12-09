import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<=Math.pow(10,4)) {
            System.out.print("Accepted");
        } else {
            System.out.print("Time limit exceeded");
        }
    }
}