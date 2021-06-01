package matrix;

class Spriral {

    static void spiralPrint(int mat[][], int m, int n) {
        int row = 0, col = 0;
        while (row < m && col < n) {
            for (int i = col; i < n; i++) {
                System.out.print(mat[row][i] + " ");
            }
            row++;
            for (int i = row; i < m; i++) {
                System.out.print(mat[i][n - 1] + " ");
            }
            n--;
            for (int i = n - 1; i >= col; i--) {
                System.out.print(mat[m - 1][i] + " ");
            }
            m--;
            for (int i = m - 1; i >= row; i--) {
                System.out.print(mat[i][col] + " ");
            }
            col++;
        }

    }

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        // for (int i = 0; i < 4; i++) {
        // for (int j = 0; j < 4; j++) {
        // System.out.print(a[i][j] + " ");
        // }
        // System.out.println();
        // }

        // System.out.println();
        // spiralPrint(a, 4, 4);

        int n = 2 % 4;
        System.out.print(n);
    }
}
