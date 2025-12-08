import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][3];
        
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        int[] prev = new int[3];
        for (int i=0; i<3; i++) {
            prev[i] = arr[0][i];
        }
        
        for (int i=1; i<n; i++) {
            int[] cur = new int[3];
            cur[0] = arr[i][0] + Math.min(prev[1], prev[2]);
            cur[1] = arr[i][1] + Math.min(prev[0], prev[2]);
            cur[2] = arr[i][2] + Math.min(prev[0], prev[1]);
            
            prev = cur;
        }
        
        int temp = Math.min(prev[0], prev[1]);
        System.out.print(Math.min(temp, prev[2]));
    }
}