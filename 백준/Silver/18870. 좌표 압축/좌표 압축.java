import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            set.add(num);
            arr[i] = num;
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<list.size(); i++) {
            map.put(list.get(i),i);
        }
        for (int i=0; i<N; i++) {
            bw.write(map.get(arr[i])+" ");
        }
        bw.flush();
    }
}