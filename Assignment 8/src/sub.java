import java.util.Scanner;
public class sub {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a number:");
        int num=sc.nextInt();
        num-=3;
        System.out.println("Sub of Number with 3:"+num);
    }
}

