import java.util.Scanner;
public class Check_vote {
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter a Age:");
        int age= myObj.nextInt();
        if(age>=18){
            System.out.println("Congratulation! You are eligible for casting your vote.");
        }else{
            System.out.println("Congratulation! You are not eligible for casting your vote.");
        }
    }
}
