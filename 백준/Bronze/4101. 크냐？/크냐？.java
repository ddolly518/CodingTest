import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int A = in.nextInt();
            int B = in.nextInt();
            if (A==0&&B==0)
                break;
            if (A > B) {
                System.out.println("Yes");
            } else 
                System.out.println("No");
        }
        in.close();
    }
}