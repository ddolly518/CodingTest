import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int b = sc.nextInt();
        while (n>0) {
            int num = n%b;
            if (num>=10) {
                sb.append((char)(num-10+'A'));
            } else {
                sb.append((char)(num+'0'));
            }
            n/=b;
        }
        System.out.println(sb.reverse().toString());
    }
}