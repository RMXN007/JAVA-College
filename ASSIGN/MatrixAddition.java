public class MatrixAddition {
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4}}, b = {{4,3},{2,1}}, sum = new int[2][2];
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                sum[i][j] = a[i][j] + b[i][j];
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++)
                System.out.print(sum[i][j] + " ");
            System.out.println();
        }
    }
}
