import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            for (int j=0; j<S.length(); j++) {
                char ch = S.charAt(j);
                for (int k=0; k<R; k++) {
                    System.out.print(ch);
                }
            }
            System.out.println();
        }
    }
}