import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = 1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<n; i++) {
            int m = Integer.parseInt(st.nextToken());
            if (m==num) {
                num++;
            } else {
                stack.push(m);
            }
            while (!stack.isEmpty() && stack.peek()==num) {
                stack.pop();
                num++;
            } 
        }
        if (stack.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}