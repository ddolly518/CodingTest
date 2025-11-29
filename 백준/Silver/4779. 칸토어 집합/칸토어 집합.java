import java.util.*;
import java.io.*;

public class Main {
    static BufferedWriter bw;
    static StringBuilder sb;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        
        while ((line=br.readLine())!=null) {
            sb = new StringBuilder();
            int num = Integer.parseInt(line);
            fun(0, (int)Math.pow(3,num));
            bw.write(sb.toString()+"\n");
        }
        
        bw.flush();
    }
    
    private static void fun(int start, int end) {
        int num = end-start;
        
        if (num==1) {
            sb.append("-");
            return;
        }
        
        fun(start,start+num/3);
        for (int i=0; i<num/3; i++) {
            sb.append(" ");
        }
        fun(start+num/3*2,end);
    }
}