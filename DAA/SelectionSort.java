import java.util.Scanner;

public class SelectionSort { 
    // Method to perform Selection Sort
        public static void selectionSort(int[] arr) {
                int n = arr.length;

                        for (int i = 0; i < n - 1; i++) {
                                    int minIndex = i; // Assume the first element is the minimum

                                                // Find the minimum element in the unsorted part of the array
                                                            for (int j = i + 1; j < n; j++) {
                                                                            if (arr[j] < arr[minIndex]) {
                                                                                                minIndex = j; // Update the index of the minimum element
                                                                                                                }
                                                                                                                            }

                                                                                                                                        // Swap the found minimum element with the first unsorted element
                                                                                                                                                    int temp = arr[minIndex];
                                                                                                                                                                arr[minIndex] = arr[i];
                                                                                                                                                                            arr[i] = temp;
                                                                                                                                                                                    }
                                                                                                                                                                                        }

                                                                                                                                                                                            // Helper method to print the array
                                                                                                                                                                                                public static void printArray(int[] arr) {
                                                                                                                                                                                                        for (int num : arr) {
                                                                                                                                                                                                                    System.out.print(num + " ");
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                    System.out.println();
                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                            // Main method to test Selection Sort
                                                                                                                                                                                                                                                public static void main(String[] args) {
                                                                                                                                                                                                                                                        Scanner scanner = new Scanner(System.in);

                                                                                                                                                                                                                                                                // Prompt user for input
                                                                                                                                                                                                                                                                        System.out.print("Enter the number of elements: ");
                                                                                                                                                                                                                                                                                int n = scanner.nextInt();
                                                                                                                                                                                                                                                                                        int[] arr = new int[n];

                                                                                                                                                                                                                                                                                                System.out.println("Enter the elements:");
                                                                                                                                                                                                                                                                                                        for (int i = 0; i < n; i++) {
                                                                                                                                                                                                                                                                                                                    arr[i] = scanner.nextInt();
                                                                                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                                                                                    System.out.println("Original Array:");
                                                                                                                                                                                                                                                                                                                                            printArray(arr);

                                                                                                                                                                                                                                                                                                                                                    selectionSort(arr); // Perform Selection Sort

                                                                                                                                                                                                                                                                                                                                                            System.out.println("Sorted Array:");
                                                                                                                                                                                                                                                                                                                                                                    printArray(arr);

                                                                                                                                                                                                                                                                                                                                                                            scanner.close();
                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                