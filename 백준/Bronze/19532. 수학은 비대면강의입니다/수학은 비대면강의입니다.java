import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        double c = Double.parseDouble(st.nextToken());
        double d = Double.parseDouble(st.nextToken());
        double e = Double.parseDouble(st.nextToken());
        double f = Double.parseDouble(st.nextToken());
        int x = (int)((c*e - b*f) / (a*e - b*d));
        int y = (int)((a*f - c*d) / (a*e - b*d));
        System.out.println(x+" "+y);
    }
}