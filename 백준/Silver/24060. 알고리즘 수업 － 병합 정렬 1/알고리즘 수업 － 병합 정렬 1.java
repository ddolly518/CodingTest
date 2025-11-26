import java.util.*;

public class Main {
    static int N;
    static int K; 
    static int[] A;
    static int count;
    static int[] tmp;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        A = new int[N+1];
        tmp = new int[N+1];
        count = 0;
        
        for (int i=1; i<=N; i++) {
            A[i] = sc.nextInt();
        }
        
        merge_sort(1,N);
        if (count < K) {
            System.out.print(-1);
        }
    }
    
    private static void merge_sort(int p, int r) { 
        if (p < r) {
            int q = (p + r) / 2;      
            merge_sort(p, q);    
            merge_sort(q + 1, r);  
            merge(p, q, r);      
        }
    }
    
    private static void merge(int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 1;
        
        while (i <= q && j <= r) {
            if (A[i] <= A[j])
                tmp[t++] = A[i++];
            else 
                tmp[t++] = A[j++];
        }
        while (i <= q)  
            tmp[t++] = A[i++];
        while (j <= r)
            tmp[t++] = A[j++];
        i = p; 
        t = 1;
        while (i <= r) {
            count++;
            A[i++] = tmp[t++]; 
            if (count == K) {
                System.out.print(A[i-1]);
            }
        }
    }
}