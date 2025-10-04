import java.util.*;
import java.io.*;

public class Main {
    private static int[][][] w = new int[105][105][105];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a==-1 && b==-1 && c==-1) {
                break;
            }
            bw.write("w("+a+", "+b+", "+c+") = "+fun(a,b,c)+"\n");
        }
        bw.flush();
        bw.close();
    }
    private static int fun(int a, int b, int c) {
        if (a<=0 || b<=0 || c<=0) {
            return 1;
        }
        if (a>20 || b>20 || c>20) {
            return fun(20,20,20);
        }
        if (w[a][b][c]!=0) return w[a][b][c];
        if (a<b && b<c) {
            w[a][b][c] = fun(a,b,c-1)+fun(a,b-1,c-1)-fun(a,b-1,c);
        } else {
            w[a][b][c] = fun(a-1,b,c)+fun(a-1,b-1,c)+fun(a-1,b,c-1)-fun(a-1,b-1,c-1);
        }
        return w[a][b][c];
    }
}