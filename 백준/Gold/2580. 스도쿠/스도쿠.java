import java.util.*;
import java.io.*;

public class Main {
    static int[][] arr = new int[9][9];
    static BufferedWriter bw;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for (int i=0; i<9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        backtracking(0,0);
        
        bw.flush();
    }
    
    private static void backtracking(int x, int y) throws IOException {
        
        if (x==9) { 
            print();
            bw.flush();
            System.exit(0);
            return;
        } else if (y==9) {
            backtracking(x+1, 0);
            return;
        }
        
        if (arr[x][y] != 0) {
            backtracking(x, y+1);
            return;
        }
        
        for (int i=1; i<10; i++) {
            boolean bo = true;
            
            for (int j=0; j<9; j++) {
                if (i == arr[x][j]) {
                    bo = false;
                    break;
                } else if (i == arr[j][y]) {
                    bo = false;
                    break;
                }
            }
            
            int row = 3*(x/3);
            int col = 3*(y/3);
            
            for (int j=0; j<3; j++) {
                for (int k=0; k<3; k++) {
                    if (i == arr[row+j][col+k]) {
                        bo = false;
                        break;
                    }
                }
            }
            
            if (bo) {
                arr[x][y] = i;
                backtracking(x, y+1);
                arr[x][y] = 0;
            }
        }
    }
    
    private static void print() throws IOException {
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                bw.write(arr[i][j]+" ");
            }
            bw.newLine();
        }
    }
}