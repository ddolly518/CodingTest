import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int num = H*60+M-45;
        if (num<0) {
            num+=24*60;
        }
        System.out.println(num/60+" "+num%60);
    }
}