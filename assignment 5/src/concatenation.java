import java.util.Scanner;
public class concatenation {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String firstName = myObj.nextLine();
        System.out.println("Enter Last Name:");
        String lastName = myObj.nextLine();
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

    }
}
