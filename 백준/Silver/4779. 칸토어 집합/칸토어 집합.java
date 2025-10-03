import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        while ((line=br.readLine())!=null) {
            int n = Integer.parseInt(line);
            int num = (int) Math.pow(3,n);
            bw.write(fun(1,num)+"\n");
        }
        bw.flush();
        bw.close();
    }
    private static String fun(int a, int b) {
        StringBuilder sb = new StringBuilder();
        int num = b-a+1;
        if (num==1) {
            sb.append("-");
        } else {
            int len = num/3;
            sb.append(fun(a, a+len-1));
            String s = " ";
            sb.append(s.repeat(len));
            sb.append(fun(b-len+1, b));
        }
        return sb.toString();
    }
}