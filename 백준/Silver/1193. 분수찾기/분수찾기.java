import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = 1;
        int a = 0;
        int b = 0;
        while (x>n*(n+1)/2) {
            n++;
        }
        int num = x-(n*(n-1)/2);
        if (n%2==0) {
            a=num;
            b = (n+1)-a;
        } else {
            b=num;
            a = (n+1)-b;
        }
        System.out.println(a+"/"+b);
    }
}