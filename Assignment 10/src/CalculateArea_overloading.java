import  java.util.Scanner;
public class CalculateArea_overloading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Circle.");
        System.out.println("Enter 2 for Rectangle.");
        System.out.println("Enter 3 for Triangle.");
        int option=sc.nextInt();
        switch(option){
            case 1:
                System.out.println("Enter Radius of Circle:");
                double radius=sc.nextDouble();
                calculateArea(radius);
            case 2:
                System.out.println("Enter Length of Circle:");
                double length=sc.nextDouble();
                System.out.println("Enter Width of Circle:");
                double width=sc.nextDouble();
                calculateArea(length,width);
            case 3:
                System.out.println("Enter Base of Circle:");
                double base=sc.nextDouble();
                System.out.println("Enter Height of Circle:");
                double height=sc.nextDouble();
                calculateArea(base,height);
            default:
                System.out.println("Out of option.");
        }
    }
}
