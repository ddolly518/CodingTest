import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int C = sc.nextInt();
        
        int num = Integer.parseInt(A)+Integer.parseInt(B)-C;
        int num2 = Integer.parseInt(A+B)-C;
        System.out.println(num);
        System.out.print(num2);
    }
}