import java.util.Scanner;
public class Conc_of_Two_Number_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        String number1 = sc.nextLine();
        System.out.println("Enter 2nd Number:");
        String number2 = sc.nextLine();
        String Conc=number1+number2;
        System.out.println("Concatenation of Two Number:"+Conc);
    }
}
