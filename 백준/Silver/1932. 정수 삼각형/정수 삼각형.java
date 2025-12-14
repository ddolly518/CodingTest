import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<i+1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        int[][] num = new int[n][n];
        num[0][0] = arr[0][0];
        int max = Integer.MIN_VALUE;
        
        for (int i=1; i<n; i++) {
            for (int j=0; j<i+1; j++) {
                if (j==0) {
                    num[i][j] = num[i-1][j] + arr[i][j];
                } else if (j == i) {
                    num[i][j] = num[i-1][j-1] + arr[i][j];
                } else {
                    num[i][j] = Math.max(num[i-1][j], num[i-1][j-1]) + arr[i][j];
                }
            }
        }
        
        for (int i=0; i<n; i++) {
            max = Math.max(num[n-1][i], max);
        }
        
        System.out.print(max);
    }
}