import java.util.*;
import java.io.*;

public class Main {
    static long[] arr;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        arr = new long[101];
        
        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());
            bw.write(fun(num)+"\n");
        }
        bw.flush();
    }
    
    private static long fun(int n) {
        if (arr[n]!=0) {
            return arr[n];
        }
        
        if (n<4) {
            return arr[n] = 1;
        } 
        
        return arr[n] = fun(n-2)+fun(n-3);
    }
}