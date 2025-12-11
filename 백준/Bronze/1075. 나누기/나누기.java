import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()/100*100;
        int f = sc.nextInt();
        
        for (int i=0; i<100; i++) {
            if ((n+i)%f==0) {
                if (i<10) {
                    System.out.print("0"+i);
                } else {
                    System.out.print(i);
                }
                break;
            }
        }
    }
}