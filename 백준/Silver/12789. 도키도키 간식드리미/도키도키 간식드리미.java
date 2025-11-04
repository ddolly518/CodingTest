import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int count = 1;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            
            if (num == count) {
                count++;
            } else {
                stack.push(num);
            }
            while (!stack.isEmpty() && stack.peek()==count) {
                stack.pop();
                count++;
            }
        }
        
        if (stack.isEmpty() && count == N+1) {
            System.out.print("Nice");
        } else {
            System.out.print("Sad");
        }
    }
}