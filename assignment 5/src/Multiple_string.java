import java.util.Scanner;
public class Multiple_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = sc.nextLine();
        System.out.println("Enter Your Age:");
        String age = sc.nextLine();
        System.out.println("Enter Your Address:");
        String address = sc.nextLine();
        System.out.println("My Name is " + name + ".");
        System.out.println("My Age is " + age + ".");
        System.out.println("My Address is " + address + ".");
    }
}
