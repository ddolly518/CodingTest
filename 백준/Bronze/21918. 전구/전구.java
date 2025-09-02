import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            switch (a) {
                case 1 : 
                    arr[b-1] = c;
                    break;
                case 2 :
                    for (int j=b-1; j<c; j++) {
                        if (arr[j]!=0) arr[j]=0;
                        else arr[j]=1;
                    }
                    break;
                case 3 :
                    for (int j=b-1; j<c; j++) {
                        arr[j]=0;
                    }
                    break;
                case 4 :
                    for (int j=b-1; j<c; j++) {
                        arr[j]=1;
                    }
                    break;
            }
        }
        for (int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}