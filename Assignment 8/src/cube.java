import java.util.Scanner;
public class cube {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a number:");
        int num= sc.nextInt();

        for(int i=1;i*i*i<=num;i++) {
            if (i * i * i = num) {
                System.out.println("it is cube");
            } else {
                System.out.println("it is not cube");
            }
        }
    }
}
