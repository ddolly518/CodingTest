import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int answer = 0;
        Set<String> set = new HashSet<>();
        for (int i=0; i<s.length(); i++) {
            for (int j=i+1; j<=s.length(); j++) {
                String str = s.substring(i,j);
                set.add(str);
            }
        }
        answer = set.size();
        System.out.println(answer);
    }
}