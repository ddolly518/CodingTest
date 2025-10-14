import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        if (str.isEmpty()) {
            System.out.print(0);
        } else {
            String[] arr = str.split(" ");
            System.out.print(arr.length);
        }
    }
}