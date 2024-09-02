import java.util.Scanner;
public class Sum_of_row_column {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int[][] matrix = new int [3][3];
        System.out.println("Enter Element of matrix:");
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Element [" + i + "][" + j + "]:");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sum of each Rows:");
        for(int i=0;i<3;i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum = rowSum + matrix[i][j];
            }
            System.out.println("Row"+(i+1)+":"+rowSum);
        }
        System.out.println("Sum of each Column:");
        for(int i=0;i<3;i++) {
            int columnSum = 0;
            for (int j = 0; j < 3; j++) {
                columnSum = columnSum + matrix[i][j];
            }
            System.out.println("Column"+(i+1)+":"+columnSum);
        }
    }
}
