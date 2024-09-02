import java.util.Scanner;
public class Matrix_addition {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int[][] matrix1 = new int [2][2];
        int[][] matrix2 = new int [2][2];
        int[][] resultMatrix= new int[2][2];

        System.out.println("Enter Element of 1st matrix:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("Element ["+i+"]["+j+"]:");
                matrix1[i][j] =sc.nextInt();
            }
        }
        System.out.println("Enter Element of 2nd matrix:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++) {
                System.out.println("Element [" + i + "][" + j + "]:");
                matrix2[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++) {
                resultMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        System.out.println("Result of 2x2 matrix after addition:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++) {
                System.out.println(resultMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

