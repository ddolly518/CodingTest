import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String str = "";
        if (a<b) {
            str = "Bus";
        } else if (a>b) {
            str = "Subway";
        } else {
            str = "Anything";
        }
        System.out.println(str);
    }
}