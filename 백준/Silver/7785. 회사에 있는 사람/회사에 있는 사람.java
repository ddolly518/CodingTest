import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();
            String status = st.nextToken();
            if (status.equals("enter")) {
                set.add(str);
            } else {
                set.remove(str);
            }
        }
        List<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        for (int i=0; i<list.size(); i++) {
            bw.write(list.get(i)+"\n");
        }
        bw.flush();
    }
}