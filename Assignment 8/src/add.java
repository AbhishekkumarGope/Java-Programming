import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a number:");
        int num=sc.nextInt();
        num+=5;
        System.out.println("Sum of Number with 5:"+num);
    }
}
