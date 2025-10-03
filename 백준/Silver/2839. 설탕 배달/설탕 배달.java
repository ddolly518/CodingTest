import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n/5;
        int num = -1;
        for (int i=a; i>=0; i--) {
            int b = n-5*i;
            if (b%3==0) {
                int c = b/3;
                num = i+c;
                break;
            }
        }
        System.out.println(num);
    }
}