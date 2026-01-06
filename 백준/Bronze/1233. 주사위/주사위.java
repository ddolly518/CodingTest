import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int[] count = new int[a+b+c+1];
        for (int i=1; i<=a; i++) {
            for (int j=1; j<=b; j++) {
                for (int k=1; k<=c; k++) {
                    count[i+j+k]++;
                }
            }
        }
        
        int answer = 0;
        int max = 0;
        for (int i=3; i<a+b+c+1; i++) {
            if (max < count[i]) {
                max = count[i];
                answer = i;
            }
        }
        System.out.println(answer);
    }
}