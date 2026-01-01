import java.util.*;
import java.io.*;

public class Main {
    static String[][] arr;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        arr = new String[n][n];
        
        for (int i=0; i<n; i++) {
            Arrays.fill(arr[i], " ");
        }
        
        f(n, 0, 0);
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                bw.write(arr[i][j]+"");
            }
            bw.write("\n");
        }
        
        bw.flush();
    }
    
    private static void f(int length, int x, int y) {
        if (length == 1) {
            arr[x][y] = "*";
            return;
        }
        
        int num = length/3;
        f(num, x, y);
        f(num, x+num, y);
        f(num, x+2*num, y);
        f(num, x, y+num);
        f(num, x+2*num, y+num);
        f(num, x, y+2*num);
        f(num, x+num, y+2*num);
        f(num, x+2*num, y+2*num);
    }
}