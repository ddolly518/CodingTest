import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        if (n==1) {
            int num = Integer.parseInt(br.readLine());
            min = num;
            max = num;
        } else {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int i=0; i<n; i++) {
                int num = Integer.parseInt(st.nextToken());
                min = Math.min(min,num);
                max = Math.max(max,num);
            }
        }
        
        System.out.print(min*max);
    }
}