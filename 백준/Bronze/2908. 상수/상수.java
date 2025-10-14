import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int one = (A%10)*100 + (A%100/10)*10 + (A/100);
        int two = (B%10)*100 + (B%100/10)*10 + (B/100);
        int num = Math.max(one, two);
        System.out.print(num);
    }
}