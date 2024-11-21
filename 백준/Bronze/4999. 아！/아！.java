import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        if (a.length()>=b.length())
            System.out.print("go");
        else 
            System.out.print("no");
    }
}