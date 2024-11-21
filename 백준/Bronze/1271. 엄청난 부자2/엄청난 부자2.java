import java.util.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger A = new BigInteger(in.next());
        BigInteger B = new BigInteger(in.next());
        
        // 나누기와 나머지 계산
        if (!B.equals(BigInteger.ZERO)) {  // B가 0이 아닌지 확인
            System.out.println(A.divide(B)); // 몫
            System.out.println(A.remainder(B)); // 나머지
        } else {
            System.out.println(A); // B가 0일 경우 A 출력
        }

        in.close();
    }
}