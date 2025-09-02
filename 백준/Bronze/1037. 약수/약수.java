import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            int m = Integer.parseInt(st.nextToken());
            if (min>m) min = m;
            if (max<m) max = m;
        }
        System.out.println(min*max);
    }
}