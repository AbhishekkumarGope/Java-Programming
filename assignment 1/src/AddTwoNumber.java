import java.util.Scanner;
public class AddTwoNumber {
     public static void main(String[] args) {
       Scanner myObj = new Scanner(System.in);
       int num1;
       int num2;
       System.out.println("Enter num1");
       num1=myObj.nextInt();
       System.out.println("Enter num2");
       num2=myObj.nextInt();
       System.out.println(num1+num2);
    }
}
