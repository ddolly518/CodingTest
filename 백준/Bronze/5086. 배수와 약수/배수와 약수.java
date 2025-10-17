import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while (true) {
            String answer;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a==0 && b==0) {
                break;
            }
            if (b%a==0) {
                answer="factor";
            } else if (a%b==0) {
                answer="multiple";
            } else {
                answer="neither";
            }
            bw.write(answer+"\n");
        }
        bw.flush();
    }
}