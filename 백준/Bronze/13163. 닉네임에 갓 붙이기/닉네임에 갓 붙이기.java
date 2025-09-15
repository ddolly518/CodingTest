import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            String line = br.readLine();
            String[] arr = line.split(" ");
            String str = "god";
            StringBuilder sb = new StringBuilder(str);
            for (int j=0; j<arr.length; j++) {
                if (j!=0) {
                    sb.append(arr[j]);
                }
            }
            bw.write(sb.toString()+"\n");
        }
        
        bw.flush();
        bw.close();
    }
}