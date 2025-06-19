import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        if ((sb.reverse().toString()).equals(str)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}