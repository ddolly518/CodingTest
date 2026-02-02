import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = (int)(0.78*n);
        int b = n - (int)(0.2*0.22*n);
        System.out.println(a+" "+b);
    }
}