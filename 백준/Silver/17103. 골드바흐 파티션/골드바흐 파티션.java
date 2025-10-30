import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i=2; i<=1000000; i++) {
            boolean bo = true;
            for (int j=2; j*j<=i; j++) {
                if (i%j==0) {
                    bo = false;
                    break;
                }
            }
            if (bo)
                list.add(i);
        }
        Collections.sort(list);
        
        for (int i=0; i<N; i++) {
            int left = 0;
            int right = list.size()-1;
            int answer = 0;
            int num = Integer.parseInt(br.readLine());
            
            while (left<=right) {
                int sum = list.get(left)+list.get(right);
                if (sum < num) {
                    left++;
                } else if (sum > num) {
                    right--;
                } else {
                    answer++;
                    left++;
                    right--;
                }
            }
            
            bw.write(answer+"\n");  
        }
        bw.flush();
    }
}