import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[101][101];
        int answer = 0;
        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for (int j=a; j<a+10; j++) {
                for (int k=b; k<b+10; k++) {
                    if (arr[j][k] == 0) {
                        arr[j][k] = 1;
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}