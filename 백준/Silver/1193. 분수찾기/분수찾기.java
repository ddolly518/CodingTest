import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int count = 1;
        while (n > (count*(count+1)/2))
            count++;
        
        int a = 0;
        int b = 0;
        
        if (count%2==0) {
            a = n-(count*(count-1)/2); 
            b = count+1-a;
        } else {
            b = n-(count*(count-1)/2);
            a = count+1-b;
        }
        System.out.print(a+"/"+b);
    }
}