import java.util.*;
import java.io.*;

public class Main {
    static int[] arr, tmp;
    static int count = 0;
    static int k, result = -1;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        tmp = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        merge_sort(arr, 0, n-1);
        System.out.println(result);
    }
    
    public static void merge_sort(int[] A, int p, int r) { 
        if (p < r) {
            int q = (p + r) / 2;      
            merge_sort(A, p, q);     
            merge_sort(A, q + 1, r); 
            merge(A, p, q, r);        
        }
    }

    public static void merge(int[] A, int p, int q, int r) {
        int i = p; 
        int j = q + 1;
        int t = 0;
        while (i <= q && j <= r) {
            if (A[i] <= A[j]) tmp[t++] = A[i++]; 
            else tmp[t++] = A[j++]; 
        }
        while (i <= q)  
            tmp[t++] = A[i++];
        while (j <= r)  
            tmp[t++] = A[j++];
        i = p;
        t = 0;
        while (i <= r) {
            A[i] = tmp[t++];
            count++;
            if (count == k) result = A[i];
            i++;
        }
    }
}