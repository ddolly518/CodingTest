import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        char ch = str.charAt(0);
        if (ch=='F') {
            System.out.print("Foundation");
        } else if (ch=='C') {
            System.out.print("Claves");
        } else if (ch=='V') {
            System.out.print("Veritas");
        } else if (ch=='E') {
            System.out.print("Exploration");
        }
    }
}