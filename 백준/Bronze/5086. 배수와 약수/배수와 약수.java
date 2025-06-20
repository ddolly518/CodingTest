import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if ((a+b)==0)
                break;
            String answer = "";
            if (b%a==0) {
                answer = "factor";
            } else if (a%b==0) {
                answer = "multiple";
            } else {
                answer = "neither";
            }
            System.out.println(answer);
        }
    }
}
