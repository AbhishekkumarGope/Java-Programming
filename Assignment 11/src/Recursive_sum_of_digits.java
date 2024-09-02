import java.util.Scanner;
public class Recursive_sum_of_digits {
    public static int sumOfDigits(int n){
        if (n==0){
            return 0;
        }
        return (n%10)+sumOfDigits(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to find sum:");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Enter positive number.");
        }else{
            int sum=sumOfDigits(n);
            System.out.println("sum of a number "+n+" is:"+sum);
        }
    }
}
