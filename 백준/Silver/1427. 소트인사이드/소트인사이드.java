import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = str.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        
        for (String s : arr) {
            System.out.print(s);
        }
    }
}