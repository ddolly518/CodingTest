import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        int[] answer = new int[n];
        Arrays.fill(answer, 1);
        
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr, (a,b) -> {
            return a[0]-b[0];
        });
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<i; j++) {
                if (arr[i][1] > arr[j][1]) {
                    answer[i] = Math.max(answer[i], answer[j]+1);
                }
            }
        }
        
        int max = 0;
        for (int i=0; i<n; i++) {
            max = Math.max(answer[i], max);
        }
        
        bw.write(n-max+"");
        bw.flush();
    }
}