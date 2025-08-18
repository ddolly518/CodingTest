import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            Stack<Character> stack = new Stack<>();
            String st = br.readLine();
            boolean bo = true;
            for (int j=0; j<st.length(); j++) {
                Character str = st.charAt(j);
                if (str=='(')
                    stack.push('(');
                else if (!stack.isEmpty() && str==')')
                    stack.pop();
                else {
                    bo = false;
                    break;
                }
            }
            if (!stack.isEmpty())
                bo = false;
            if (bo) {
                bw.write("YES"+"\n");
            } else {
                bw.write("NO"+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}