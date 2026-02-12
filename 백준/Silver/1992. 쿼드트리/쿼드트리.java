import java.util.*;
import java.io.*;

public class Main {
    static int[][] arr;
    static StringBuilder sb;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        sb = new StringBuilder();
        
        for (int i=0; i<n; i++) {
            String line = br.readLine();
            for (int j=0; j<n; j++) {
                arr[i][j] = line.charAt(j)-'0';
            }
        }
        fun(0,0,n);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
    private static void fun(int x, int y, int len) {
        int num = arr[x][y];
        
        if (check(x,y,len)) {
            sb.append(num);
            return;
        }
        
        sb.append("(");
        fun(x,y,len/2);
        fun(x,y+len/2,len/2);
        fun(x+len/2,y,len/2);
        fun(x+len/2,y+len/2,len/2);
        sb.append(")");
    }
    
    private static boolean check(int x, int y, int len) {
        int num = arr[x][y];
        
        for (int i=0; i<len; i++) {
            for (int j=0; j<len; j++) {
                if (arr[x+i][y+j]!=num) {
                    return false;
                }
            }
        }
        
        return true;
    }
}