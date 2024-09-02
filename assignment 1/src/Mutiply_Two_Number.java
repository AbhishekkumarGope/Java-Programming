import java.util.Scanner;
public class Mutiply_Two_Number {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number1:");
        int number1 = myObj.nextInt();
        System.out.println("Enter the number2:");
        int number2 = myObj.nextInt();
        System.out.println("Product of Two Numbers is "+number1*number2);
    }
}
