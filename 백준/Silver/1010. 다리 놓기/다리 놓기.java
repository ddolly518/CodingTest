import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(fun(a,b)+"\n");
        }
        bw.flush();
    }
    private static int fun(int a, int b) {
        int answer = 1;
        for (int i=1; i<=a; i++) {
            answer*=b;
            answer/=i;
            b--;
        }
        return answer;
    }
}