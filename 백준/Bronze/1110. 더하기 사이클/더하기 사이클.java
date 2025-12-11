import java.util.*;

public class Main {
    static int num;
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        num = n;
        
        while(true) {
            count++;
            if (n == fun()) {
                System.out.print(count);
                break;
            }
        }
    }
    
    private static int fun() {
        if (num<10) {
            return num = num*10+num;
        }
        
        int sum = num/10+num%10;
        return num = num%10*10+sum%10;
    }
}