import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int['z'-'a'+1];
        Arrays.fill(arr,-1);
        String str = sc.next();
        for (int i=str.length()-1; i>=0; i--) {
            char ch = str.charAt(i);
            arr[ch-'a']=i;
        }
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}