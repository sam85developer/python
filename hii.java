import java.util.*;
public class hii {
    public static void main(String[] args) {
        int matrix [][] = new int [3][3];
        int n = 3, m = 3;
        Scanner sc = new Scanner(System.in);

        // input
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // output (matrix format)
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // row complete, next line
        }
    }
}
