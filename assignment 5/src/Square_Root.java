import java.util.Scanner;
public class Square_Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int number= sc.nextInt();
        double sqrt=Math.sqrt(number);
        System.out.println("Square root of Number:"+sqrt);
    }
}
