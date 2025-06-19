import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=0; i<2*N-1; i++) {
            int num = Math.abs(i-(N-1));
            for (int j=0; j<num; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<2*N-1-2*num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}