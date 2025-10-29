import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num;
        
        while ((num=Integer.parseInt(br.readLine()))!=0) {
            int answer = 0;
            for (int i=num+1; i<=2*num; i++) {
                boolean bo = true;
                for (int j=2; j*j<=i; j++) {
                    if (i%j==0) {
                        bo = false;
                        break;
                    }
                }
                if (bo)
                    answer++;
            }
            bw.write(answer+"\n");
        }
        bw.flush();
    }
}