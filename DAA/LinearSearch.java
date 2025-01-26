import java.util.Scanner;

public class LinearSearch {

    // Method to perform Linear Search
        public static int linearSearch(int[] arr, int target) {
                for (int i = 0; i < arr.length; i++) {
                            if (arr[i] == target) {
                                            return i; // Return the index if target is found
                                                        }
                                                                }
                                                                        return -1; // Return -1 if target is not found
                                                                            }

                                                                                // Main method to test Linear Search
                                                                                    public static void main(String[] args) {
                                                                                            Scanner scanner = new Scanner(System.in);

                                                                                                    // Input the size of the array
                                                                                                            System.out.print("Enter the number of elements: ");
                                                                                                                    int n = scanner.nextInt();
                                                                                                                            int[] arr = new int[n];

                                                                                                                                    // Input the elements of the array
                                                                                                                                            System.out.println("Enter the elements:");
                                                                                                                                                    for (int i = 0; i < n; i++) {
                                                                                                                                                                arr[i] = scanner.nextInt();
                                                                                                                                                                        }

                                                                                                                                                                                // Input the target element to search for
                                                                                                                                                                                        System.out.print("Enter the element to search: ");
                                                                                                                                                                                                int target = scanner.nextInt();

                                                                                                                                                                                                        // Perform Linear Search
                                                                                                                                                                                                                int result = linearSearch(arr, target);

                                                                                                                                                                                                                        // Display the result
                                                                                                                                                                                                                                if (result != -1) {
                                                                                                                                                                                                                                            System.out.println("Element found at index: " + result);
                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                System.out.println("Element not found in the array.");
                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                scanner.close();
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    