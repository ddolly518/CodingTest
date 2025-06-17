import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            min = Math.min(num,min);
            max = Math.max(num,max);
        }
        System.out.println(min+" "+max);
    }
}