import java.util.*;
import java.io.*;

public class Main {
    static long c;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        c = Long.parseLong(st.nextToken());
        
        bw.write(fun(a,b)+"");
        
        bw.flush();
        bw.close();
    }
    
    private static long fun(long a, long b) {
        if (b==1) {
            return a%c;
        }
        
        long d = fun (a,b/2);
        
        if (b%2==1) {
            return (d*d%c)*a%c;
        }
        
        return d*d%c;
    }
}