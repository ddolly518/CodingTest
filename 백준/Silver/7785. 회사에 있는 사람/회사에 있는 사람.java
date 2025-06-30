import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            String s = st.nextToken();
            if (s.equals("enter"))
                set.add(str);
            else if (s.equals("leave"))
                set.remove(str);
        }
        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        for (int i=list.size()-1; i>=0; i--) {
            bw.write(list.get(i)+"\n");
        }
        bw.flush();
        bw.close();
    }
}