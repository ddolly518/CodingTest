import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        for (int i=1; i<=count; i++) {
            System.out.println("*".repeat(i));
        }
    }
}