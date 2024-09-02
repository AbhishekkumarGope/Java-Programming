import java.util.Scanner;
public class Average_array_elements{
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = myobj.nextInt();

        System.out.println("Enter elements of the array:");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = myobj.nextInt();
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / array.length;
        System.out.println("The average of the array elements is: " + average);
    }
}