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
        answer = new int[3];
        
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        fun(0,0,n);
        bw.write(answer[0]+"\n"+answer[1]+"\n"+answer[2]);
        bw.flush();
        bw.close();
    }
    
    private static void fun(int x, int y, int len) {
        int num = arr[x][y];
        
        if (check(x,y,len)) {
            answer[num+1]++;
            return;
        }
        
        int a = len/3;
        fun(x,y,a);
        fun(x+a,y,a);
        fun(x+2*a,y,a);
        fun(x,y+a,a);
        fun(x+a,y+a,a);
        fun(x+2*a,y+a,a);
        fun(x,y+2*a,a);
        fun(x+a,y+2*a,a);
        fun(x+2*a,y+2*a,a);
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