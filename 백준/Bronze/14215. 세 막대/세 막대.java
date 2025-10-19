import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = (a+b+c);
        int max = Math.max(a,b);
        max = Math.max(max,c);
        sum-=max;
        if (max<sum) {
            System.out.print(sum+max);
        } else {
            System.out.print(2*sum-1);
        } 
    }
}