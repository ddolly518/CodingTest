import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        int[] left = new int[N];
        int[] right = new int[N];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i=0; i<N; i++) {
            for (int j=0; j<i; j++) {
                if (arr[i] > arr[j]) {
                    left[i] = Math.max(left[i], left[j]+1);
                }
            }
        }
        for (int i=N-1; i>=0; i--) {
            for (int j=N-1; j>i; j--) {
                if (arr[i] > arr[j]) {
                    right[i] = Math.max(right[i], right[j]+1);
                }
            }
        }

        int max = 1;
        for (int i=0; i<N; i++) {
            max = Math.max(left[i]+right[i]-1, max);
        }
        bw.write(max+"");
        bw.flush();
    }
}