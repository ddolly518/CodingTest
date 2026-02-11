import java.util.*;
import java.io.*;

public class Main {
    static int[][] arr;
    static int[] answer;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        answer = new int[2];
        
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        fun(0,0,n);
        bw.write(answer[0]+"\n"+answer[1]);
        bw.flush();
    }
    
    private static void fun(int x, int y, int len) {
        int num = arr[x][y];
        
        if (len == 1) {
            answer[num]++;
            return;
        }
        
        if (check(x,y,len)) {
            answer[num]++;
            return;
        }
        
        fun(x,y,len/2);
        fun(x+len/2,y,len/2);
        fun(x,y+len/2,len/2);
        fun(x+len/2,y+len/2,len/2);
    }
    
    private static boolean check(int x, int y, int len) {
        int num = arr[x][y];
        
        for (int i=0; i<len; i++) {
            for (int j=0; j<len; j++) {
                if (num!=arr[x+i][y+j]) {
                    return false;
                }
            }
        }
        return true;
    }
}