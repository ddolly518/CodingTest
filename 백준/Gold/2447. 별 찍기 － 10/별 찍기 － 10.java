import java.util.*;
import java.io.*;

public class Main {
    static char[][] arr;
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();
        arr = new char[n][n];
        
        for (int i = 0; i < n; i++) {
            Arrays.fill(arr[i], '*');
        }
        
        fun(0,0,n);
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                bw.write(arr[i][j]);
            }
            bw.newLine();
        }
        bw.flush();
    }
    
    private static void fun(int x, int y, int len) {
        if (len==1) {
            return;
        }
        int num = len/3;
        fun(x, y, num);
        fun(x+num, y, num);
        fun(x+2*num, y, num);
        fun(x, y+num, num);
        for (int i=0; i<num; i++) {
            for (int j=0; j<num; j++) {
                arr[x+num+i][y+num+j] = ' ';
            }
        }
        fun(x+2*num, y+num, num);
        fun(x, y+2*num, num);
        fun(x+num, y+2*num, num);
        fun(x+2*num, y+2*num, num);
    }
}