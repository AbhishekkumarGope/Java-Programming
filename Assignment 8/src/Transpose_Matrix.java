import java.util.Scanner;
public class Transpose_Matrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int[][] matrix = new int [3][3];
        int[][] transposeMatrix = new int [3][3];
        System.out.println("Enter Element of matrix:");
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Element [" + i + "][" + j + "]:");
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println("Original matrix:");
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose matrix:");
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
