import java.util.*;
import java.io.*;

public class Main {
    static int[] A;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[M];
        for (int i=0; i<M; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i=0; i<M; i++) {
            bw.write(fun(arr[i])+"\n");
        }
        
        bw.flush();
        bw.close();
    }
    private static int fun(int n) {
        int left = 0;
        int right = A.length-1;
        
        while (left<=right) {
            int mid = (left+right)/2;
            
            if (A[mid] == n) {
                return 1;
            } else if (A[mid] < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return 0;
    }
}