import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] answer = new int[N];
        Arrays.fill(answer, 1);
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i=0; i<N; i++) {
            for (int j=0; j<i; j++) {
                if (arr[i] > arr[j]) {
                    answer[i] = Math.max(answer[i], answer[j]+1);
                }
            }
        }
        int max = 1;
        for (int i=0; i<N; i++) {
            max = Math.max(max, answer[i]);
        }
        bw.write(max+"");
        bw.flush();
    }
}