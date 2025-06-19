import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<str.length(); i++) {
            char ch = Character.toUpperCase(str.charAt(i));
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        char answer = '?';
        int max = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (max == entry.getValue()) {
                answer = '?';
            } else if (max < entry.getValue()) {
                max = entry.getValue();
                answer = entry.getKey();
            }
        }
        System.out.println(answer);
    }
}