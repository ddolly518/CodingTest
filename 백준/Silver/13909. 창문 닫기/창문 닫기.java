import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        while (true) {
            if (num*num>n) {
                System.out.println(num-1);
                break;
            }
            num++;
        }
    }
}