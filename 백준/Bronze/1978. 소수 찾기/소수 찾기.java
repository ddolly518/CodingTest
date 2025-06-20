import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;
        for (int i=0; i<N; i++) {
            boolean bo = true;
            int num = Integer.parseInt(st.nextToken());
            if (num<2)
                continue;
            for (int j=2; j*j<=num; j++) {
                if (num%j==0)
                    bo = false;
            }
            if (bo)
                answer++;
        }
        System.out.println(answer);
    }
}