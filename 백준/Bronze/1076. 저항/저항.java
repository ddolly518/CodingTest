import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        
        Scanner sc = new Scanner(System.in);
        
        long num = 0;
        
        for (int i=0; i<3; i++) {
            String str = sc.next();
            int count = 0;
            for (int j=0; j<10; j++) {
                if (arr[j].equals(str)) {
                    count = j;
                    break;
                }
            }
            if (i==2) {
                num*=(int)Math.pow(10,count);
            } else if (i==1) {
                num+=count;
            } else {
                num+=count;
                num*=10;
            }
        }
        
        System.out.print(num);
    }
}