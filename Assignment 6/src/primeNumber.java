public class primeNumber {

    public static void main(String[] args) {

        for (int num =1; num <= 100; num++) {
            if (num < 2) {
                continue;
            }
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("The first prime number in the range is: " + num);
                break;
            }
        }
    }
}
