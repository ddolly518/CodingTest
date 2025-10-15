import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        String s = sb.reverse().toString();
        int answer = 0;
        
        if (str.equals(s)) {
            answer = 1;
        }
        
        System.out.print(answer);
    }
}