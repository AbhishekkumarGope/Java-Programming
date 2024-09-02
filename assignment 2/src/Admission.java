import java.util.Scanner;
public class Admission {
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        System.out.println("Input the marks obtained in Physics :");
        int physics= myObj.nextInt();
        System.out.println("Input the marks obtained in Chemistry :");
        int chemistry= myObj.nextInt();
        System.out.println("Input the marks obtained in Maths:");
        int maths= myObj.nextInt();
        int total_marks=physics+chemistry+maths;
        System.out.println("Total marks of Maths, Physics, and Chemistry :");
        System.out.println(total_marks);
        int total_marks_physics_maths=physics+maths;
        System.out.println("Total marks of Maths and Physics :");
        System.out.println(total_marks_physics_maths);
        if(maths>=65 && physics>=55 && chemistry>=50 && total_marks>=190 && total_marks_physics_maths>=140){
            System.out.println("The candidate is eligible for admission.");
        }else {
            System.out.println("The candidate is not eligible for admission.");
        }
    }
}
