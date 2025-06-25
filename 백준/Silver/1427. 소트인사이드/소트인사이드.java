import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        int[] arr = new int[len];
        int num = Integer.parseInt(str);
        for (int i=0; i<len; i++) {
            arr[i] = (num%10);
            num/=10;
        }
        Arrays.sort(arr);
        for (int i=len-1; i>=0; i--) {
            System.out.print(arr[i]);
        }
    }
}