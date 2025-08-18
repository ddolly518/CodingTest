import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num==0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            int num = stack.pop();
            sum+=num;
        }
        bw.write(sum+"\n");
        bw.flush();
        bw.close();
    }
}