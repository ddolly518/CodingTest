import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Map<Character, Integer> map = new HashMap<>();
        int index = -1;
        char answer = ' ';
        
        for (int i=0; i<str.length(); i++) {
            char ch = Character.toUpperCase(str.charAt(i));
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue()==index) {
                answer='?';
            } else if (entry.getValue()>index) {
                answer=entry.getKey();
                index=entry.getValue();
            }            
        }
        System.out.print(answer);
    }
}