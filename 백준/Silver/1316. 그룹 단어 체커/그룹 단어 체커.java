import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        
        for (int i=0; i<N; i++) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();
            boolean bo = true;
            for (int j=0; j<str.length(); j++) {
                char ch = str.charAt(j);
                if (!stack.isEmpty() && stack.peek()!=ch && stack.contains(ch)) {
                    bo = false;
                    break;
                } else {
                    stack.push(ch);
                }
            }
            if (bo) {
                answer++;
            }
        }
        
        System.out.print(answer);
    }
}