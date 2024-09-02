import java.util.Scanner;
public class Check_Quadrant {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a coordinate points of x:");
        int cp1 = myObj.nextInt();
        System.out.println("Enter a coordinate points of y:");
        int cp2 = myObj.nextInt();
        if (cp1 > 0 && cp2 > 0) {
            System.out.println("The coordinate point (" + cp1 + "," + cp2 + ") lies in the First quadrant.");
        } else if (cp1 < 0 && cp2 > 0) {
            System.out.println("The coordinate point (" + cp1 + "," + cp2 + ") lies in the Second quadrant.");
        } else if (cp1 < 0 && cp2 < 0) {
            System.out.println("The coordinate point (" + cp1 + "," + cp2 + ") lies in the Third quadrant.");
        } else if (cp1 > 0 && cp2 < 0) {
            System.out.println("The coordinate point (" + cp1 + "," + cp2 + ") lies in the Fourth quadrant.");
        }
    }
}