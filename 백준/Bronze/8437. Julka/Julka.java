import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger a1 = a.subtract(b);
        BigInteger c = a1.divide(BigInteger.valueOf(2));
        System.out.println(c.add(b));
        System.out.println(c);
    }
}