import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int F = sc.nextInt();
        int num = (N/100)*100;
        for (int i=0; i<100; i++) {
            int sum = num+i;
            if (sum%F==0) {
                System.out.printf("%02d",i);
                break;
            }
        }
    }
}