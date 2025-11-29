import java.util.*;
import java.io.*;

public class Main {
    static BufferedWriter bw;
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();
        
        bw.write((int)Math.pow(2,n)-1+"\n");
        hanoi(n,1,2,3);
        
        bw.flush();
    }
    
    private static void hanoi(int n, int from, int mid, int to) throws IOException {
        if (n==1) {
            bw.write(from+" "+to+"\n");
            return;
        }
        
        hanoi(n-1, from, to, mid);
        bw.write(from+" "+to+"\n");
        hanoi(n-1, mid, from, to);
    }
}