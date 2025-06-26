import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];
        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }
        Arrays.sort(arr,(a,b)-> {
            if (!a[0].equals(b[0])) {
                return Integer.compare(Integer.parseInt(a[0]),Integer.parseInt(b[0]));
            } else {
                return 0;
            }
        });
        for (int i=0; i<N; i++) {
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}