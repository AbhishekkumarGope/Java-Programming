public class BlockScope{
    public static void calculate() {
        int x = 10;
        System.out.println("Value of x outside the loop: " + x);
        for (int i = 0; i < 3; i++) {
            int x = i * 2;
            System.out.println("Value of x inside the loop (iteration " + i + "): " + x);
        }

        System.out.println("Value of x outside the loop after loop: " + x);
    }

    public static void main(String[] args) {
        calculate();
    }
}
