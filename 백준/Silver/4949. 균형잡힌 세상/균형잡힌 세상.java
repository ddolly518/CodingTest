import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        while(!(str = br.readLine()).equals(".")) {
            Stack<Character> stack = new Stack<>();
            boolean bo = true;
            
            for (int i=0; i<str.length(); i++) {
                char ch = str.charAt(i);
                
                if (ch=='(' || ch=='[')
                    stack.push(ch);
                else if (ch==')') {
                    if (stack.isEmpty() || stack.peek()!='(') {
                        bo = false;
                        break;
                    } else {
                        stack.pop();
                    }
                    
                } else if (ch==']') {
                    if (stack.isEmpty() || stack.peek()!='[') {
                        bo = false;
                        break;
                    } else {
                        stack.pop();
                    } 
                }
            }
            
            if (bo && stack.isEmpty()) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }
        bw.flush();
        bw.close();
    }
}