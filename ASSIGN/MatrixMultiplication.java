public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4}}, b = {{2,0},{1,2}}, mul = new int[2][2];
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                for(int k=0;k<2;k++)
                    mul[i][j] += a[i][k] * b[k][j];
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++)
                System.out.print(mul[i][j] + " ");
            System.out.println();
        }
    }
}
