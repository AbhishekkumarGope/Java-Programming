public class PrintNumber_1_10 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Numbers from 0 to 10:");
        while (count <= 10) {
            System.out.println(count);
            count++;
        }
        count = 10;
        System.out.println("Numbers from 10 to 0:");
        while (count >= 0) {
            System.out.println(count);
            count--;
        }
    }
}
