import java.util.*;
import java.io.*;

public class Main {
    static long p;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        p = 1000000007;
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        long N = fun(n);
        long K = (fun(k)*fun(n-k))%p;
        bw.write(N*(pow(K,p-2))%p+"");
        bw.flush();
        bw.close();
    }
    
    private static long fun(int n) {
        long num = 1;
        for (long i=n; i>1; i--) {
            num = (num*i)%p;
        }
        return num;
    }
    
    private static long pow(long n, long m) {
        if (m==1)
            return n%p;
        long temp = pow(n, m/2);
        if (m%2==1) {
            return (temp*temp%p)*n%p;
        }
        return temp*temp%p;
    }
}