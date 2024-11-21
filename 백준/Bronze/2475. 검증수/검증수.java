import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A1 = in.nextInt();
        int A2 = in.nextInt();
        int A3 = in.nextInt();
        int A4 = in.nextInt();
        int A5 = in.nextInt();
        int B = (int)(Math.pow(A1, 2)+Math.pow(A2, 2)+Math.pow(A3, 2)+Math.pow(A4, 2)+Math.pow(A5, 2))%10;
        System.out.print(B);
    }
}