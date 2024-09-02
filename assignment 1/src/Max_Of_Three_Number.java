import java.util.Scanner;
public class Max_Of_Three_Number {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("Enter num1");
        num1=myObj.nextInt();
        System.out.println("Enter num2");
        num2=myObj.nextInt();
        System.out.println("Enter num2");
        num3=myObj.nextInt();
        if(num1>=num2 && num1>=num3){
            System.out.println(num1 + "greater than"+ num2 + "and" + num3);
        } else if (num2>=num1 && num2>=num3) {
            System.out.println(num2+ "greater than"+ num1 + "and" + num3);
        } else {
            System.out.println(num3 + "greater than"+ num1 + "and" + num2);

        }
    }
}
