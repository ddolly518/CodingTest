import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('o');
        set.add('i');
        set.add('u');
        set.add('e');
        
        int answer = 0;
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (set.contains(ch)) {
                answer++;
            }
        }
        System.out.print(answer);
    }
}