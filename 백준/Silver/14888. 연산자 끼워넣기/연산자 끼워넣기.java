import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static BufferedWriter bw;
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    static int sum;
    static int[] arr;
    static int[] count;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        count = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<4; i++) {
            count[i] = Integer.parseInt(st.nextToken());
        }
        
        sum = arr[0];
        backtracking(1);
        bw.write(max+"\n"+min);
        
        bw.flush();
    }
    
    private static void backtracking(int length) throws IOException {
        if (length == n) {
            max = Math.max(max,sum);
            min = Math.min(min,sum);
            return;
        }
        
        for (int i=0; i<4; i++) {
            if (count[i]!=0) {
                count[i]--;
                int prev = sum;
                if (i==0) {
                    sum+=arr[length];
                } else if (i==1) {
                    sum-=arr[length];
                } else if (i==2) {
                    sum*=arr[length];
                } else if (i==3) {
                    sum/=arr[length];
                }
                backtracking(length+1);
                sum = prev;
                count[i]++;
            }
        }
    }
}