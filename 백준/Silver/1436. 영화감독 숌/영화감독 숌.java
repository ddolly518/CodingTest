import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 1;
        int num = 666;
        
        while (answer <= 10000) {
            if (answer==N) {
                break;
            }
            num++;
            if ((String.valueOf(num)).contains("666"))
                answer++;
        }
        
        System.out.print(num);
    }
}