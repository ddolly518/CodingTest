import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt()/4;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++) {
            sb.append("long ");
        }
        sb.append("int");
        System.out.print(sb.toString());
    }
}