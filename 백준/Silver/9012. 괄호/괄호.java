import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        
        for (int i=0; i<N; i++) {
            String[] arr = br.readLine().split("");
            Stack<String> stack = new Stack<>();
            boolean bo = true;
            
            for (int j=0; j<arr.length; j++) {
                String str = arr[j];
                if (stack.isEmpty()) {
                    stack.push(str);
                } else {
                    if (str.equals("(")) {
                        stack.push("(");
                    } else if (!(stack.pop()).equals("(")) {
                        bo = false;
                        break;
                    }
                }
            }
            
            if (!stack.isEmpty())
                bo = false;
            
            if (bo)
                bw.write("YES\n");
            else
                bw.write("NO\n");
        }
        
        bw.flush();
    }
}