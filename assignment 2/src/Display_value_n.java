import java.util.Scanner;
public class Display_value_n {
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter the value of m:");
        int m= myObj.nextInt();
        if(m>0){
            System.out.println("The value of n = 1");
        } else if (m<0) {
            System.out.println("The value of n = -1");
        }else{
            System.out.println("The value of n = 0");
        }
    }
}
