import java.util.Scanner;
public class Check_height {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the height of person(in cm):");
        int height = myObj.nextInt();
        if(height<150){
            System.out.println("The person is Dwarf.");
        } else if (height>150 && height<165) {
            System.out.println("The person has Average Height.");
        }
        else{
            System.out.println("The person is Tall.");
        }
    }
}