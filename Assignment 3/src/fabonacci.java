public class fabonacci {
    public static void main(String[] args) {
        int count = 0;
        int a = 0;
        int b = 1;

        System.out.println("The first 10 Fibonacci numbers are:");

        while (count < 10) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            count++;
        }
    }
}
