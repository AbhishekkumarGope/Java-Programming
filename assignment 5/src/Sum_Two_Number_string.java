import java.util.Scanner;
public class Sum_Two_Number_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        String number1 = sc.nextLine();
        System.out.println("Enter 2nd Number:");
        String number2 = sc.nextLine();
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        int sum = num1 + num2;
        System.out.println("Sum of Two Numbers: " + sum);
    }
}
