import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        int first = Integer.parseInt(n.charAt(0) + "", 8);
        System.out.print(Integer.toString(first,2));

        for (int i = 1; i < n.length(); i++) {
            int num = Integer.parseInt(n.charAt(i) + "", 8);
            String str = Integer.toString(num,2);

            while (str.length() < 3) {
                str = "0" + str;
            }

            System.out.print(str);
        }
    }
}
