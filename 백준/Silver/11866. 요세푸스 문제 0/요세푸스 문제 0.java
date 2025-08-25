import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int num = 0;
        for (int i=1; i<=n; i++) {
            list.add(i);
        }
        System.out.print("<");
        while(!list.isEmpty()) {
            num+=k;
            num = (num-1)%list.size();
            System.out.print(list.remove(num));
            if (!list.isEmpty()) {
                System.out.print(", ");
            }
                            
        }
        System.out.println(">");
    }
}