import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int len = str.length();
        int[][] arr = new int[len+1]['z'-'a'+1];
        
        for (int i=0; i<len; i++) {
            char ch = str.charAt(i);
            
            for (int j=0; j<26; j++) {
                arr[i+1][j] = arr[i][j];
            }
            arr[i+1][ch-'a']++;
        }
        
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            char ch = st.nextToken().charAt(0);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int num = arr[b+1][ch-'a'] - arr[a][ch-'a'];
            bw.write(num+"\n");
        }
        bw.flush();
    }
}