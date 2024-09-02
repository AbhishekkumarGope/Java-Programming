import java.util.Scanner;
public class Calculate_Factorial_using_Recursion {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to find factorial:");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Enter positive number.");
        }else{
            int factorial=factorial(n);
            System.out.println("factorial of a number "+n+" is:"+factorial);
        }
    }
}
