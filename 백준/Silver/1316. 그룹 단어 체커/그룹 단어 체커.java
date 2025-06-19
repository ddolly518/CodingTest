import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i=0; i<N; i++) {
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean bo = true;
            for (int j=0; j<str.length(); j++) {
                char ch = str.charAt(j);
                if (stack.isEmpty()) {
                    stack.push(ch);
                } else {
                    if (stack.peek()!=ch) {
                        if (!stack.contains(ch)) {
                            stack.push(ch);
                        } else {
                            bo = false;
                        }
                    }
                }
            }
            if (bo) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}