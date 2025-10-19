import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int min_x = Integer.MAX_VALUE;
        int min_y = Integer.MAX_VALUE;
        int max_x = Integer.MIN_VALUE;
        int max_y = Integer.MIN_VALUE;
        
        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken());
            min_x = Math.min(min_x,one);
            max_x = Math.max(max_x,one);
            int two = Integer.parseInt(st.nextToken());
            min_y = Math.min(min_y,two);
            max_y = Math.max(max_y,two);
        }
        int answer = (max_x-min_x)*(max_y-min_y);
        System.out.print(answer);
    }
}