import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());
            X-=(a*b);
        }
        if (X==0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}