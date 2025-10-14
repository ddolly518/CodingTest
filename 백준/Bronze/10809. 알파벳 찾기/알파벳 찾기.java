import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = 'z'-'a'+1;
        int[] arr = new int[num+1];
        Arrays.fill(arr,-1);
        
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            int n = ch-'a';
            if (arr[n]==-1) {
                arr[n] = i;
            }
        }
        for (int i=0; i<num; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}