import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] arr = new int[4];
        arr[0] = 1;
        arr[3] = 2;
        int small = 0;
        int big = 0;
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            int a = 0;
            int b = 0;
            switch (ch) {
                case 'A' : 
                    a=0;
                    b=1;
                    break;
                case 'B' :
                    a=0;
                    b=2;
                    break;
                case 'C' :
                    a=0;
                    b=3;
                    break;
                case 'D' :
                    a=1;
                    b=2;
                    break;
                case 'E' :
                    a=1;
                    b=3;
                    break;
                case 'F' :
                    a=2;
                    b=3;
                    break;
            }
            if (arr[a]!=arr[b]) {
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp; 
            }
        }
        for (int i=0; i<4; i++) {
            if (arr[i]==1) {
                small = i;
            } else if (arr[i]==2) {
                big = i;
            }
        }
        System.out.println(small+1);
        System.out.println(big+1);
    }
}