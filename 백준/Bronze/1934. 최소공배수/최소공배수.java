import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            bw.write(lcm(A,B)+"\n");
        }
        
        bw.flush();
    }
    
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
    private static int lcm(int a, int b) {
        return Math.abs(a*b)/gcd(a,b);
    }
}