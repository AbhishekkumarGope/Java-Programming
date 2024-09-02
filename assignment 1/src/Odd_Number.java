import java.util.Scanner;
public class Odd_Number {
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        int number;
        System.out.println("Enter the Number");
        number=myObj.nextInt();
        if(number % 2 == 0){
            System.out.println(number+" is even.");
        }else{
            System.out.println(number+"is odd.");
        }
    }
}