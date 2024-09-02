import java.util.Scanner;
public class Fibonacci_sequence {
    public static int fabonacci(int n){
        if (n==0){
            return 0;
        }
        else if(n==1) {
            return 1;
        }
        return fabonacci(n-1)+fabonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to find fabonacci:");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Enter positive number.");
        }else{
            int fabonacci=fabonacci(n);
            System.out.println("sum of a number "+n+" is:"+fabonacci);
        }
    }
}
