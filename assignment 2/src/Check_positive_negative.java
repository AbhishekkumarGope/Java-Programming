import java.util.Scanner;
public class Check_positive_negative {
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number= myObj.nextInt();
        if(number>0){
            System.out.println("Number is Positive.");
        } else if (number<0) {
            System.out.println("Number is Negative.");
        }else{
            System.out.println("Number is Zero.");
        }
    }
}
