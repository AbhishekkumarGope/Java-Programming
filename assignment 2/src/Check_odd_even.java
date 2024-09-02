import java.util.Scanner;
public class Check_odd_even {
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number=myObj.nextInt();
        if(number%2==0){
            System.out.println("Number is Even.");
        }else{
            System.out.println("Nuber is Odd.");
        }
    }
}
