import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        int answer = 0;
        boolean first = true;
        
        while(st.hasMoreTokens()) {
            String line = st.nextToken();
            String[] arr = line.split("\\+");
            int temp = 0;
            for (int i=0; i<arr.length; i++) {
                temp+=Integer.parseInt(arr[i]);
            }
            
            if (first) {
                first = false;
                answer+=temp;
            } else {
                answer-=temp;
            }
        }
        bw.write(answer+"");
        bw.flush();
    }
}