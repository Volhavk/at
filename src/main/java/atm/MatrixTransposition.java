package atm;

public class MatrixTransposition {
    public static void main(String[] args) {
        int[][] matrix = new int[3][];
        int[][] transpMatrix = new int[3][];

        for(int i=0; i < matrix.length; i++) {
            matrix[i] = new int[3];
            transpMatrix[i] = new int[3];
            for (int n=0; n<matrix.length; n++) {
                matrix[i][n] = (int)Math.round((Math.random()*100));
                System.out.print(matrix[i][n] + " ");
            }
            System.out.println();
        }
        System.out.println("Result: ");
        for (int i = 0; i < transpMatrix.length; i++) {
            for (int n = 0; n < transpMatrix.length; n++) {
                transpMatrix[i][n] = matrix[n][i];
                System.out.print(transpMatrix[i][n] + " ");
            }
            System.out.println();
        }
    }
}
