import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<int[]> list = new ArrayList<>();
        for (int i=1; i<=n; i++) {
            list.add(new int[]{i,Integer.parseInt(st.nextToken())});
        }
        
        int index = 0;
        for (int i=0; i<n; i++) {
            int[] num = list.remove(index);
            bw.write(num[0]+" ");
            if (list.isEmpty())
                break;
            int move = num[1];
            if (move > 0) {
                index = (index + (move - 1)) % list.size();
            } else {
                index = (index + move) % list.size();
                if (index < 0) index += list.size();
            }
        }
        bw.flush();
        bw.close();
    }
}