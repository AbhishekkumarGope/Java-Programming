import java.util.Scanner;

public class InsertionSort { 
    // Method to perform Insertion Sort
        public static void insertionSort(int[] arr) {
                int n = arr.length;

                        for (int i = 1; i < n; i++) {
                                    int key = arr[i];
                                                int j = i - 1;

                                                            // Shift elements of arr[0..i-1] that are greater than key
                                                                        while (j >= 0 && arr[j] > key) {
                                                                                        arr[j + 1] = arr[j];
                                                                                                        j--;
                                                                                                                    }

                                                                                                                                // Insert the key at its correct position
                                                                                                                                            arr[j + 1] = key;
                                                                                                                                                    }
                                                                                                                                                        }

                                                                                                                                                            // Helper method to print the array
                                                                                                                                                                public static void printArray(int[] arr) {
                                                                                                                                                                        for (int num : arr) {
                                                                                                                                                                                    System.out.print(num + " ");
                                                                                                                                                                                            }
                                                                                                                                                                                                    System.out.println();
                                                                                                                                                                                                        }

                                                                                                                                                                                                            // Main method to test Insertion Sort
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

                                                                                                                                                                                                                                                                                                                    insertionSort(arr); // Perform Insertion Sort

                                                                                                                                                                                                                                                                                                                            System.out.println("Sorted Array:");
                                                                                                                                                                                                                                                                                                                                    printArray(arr);

                                                                                                                                                                                                                                                                                                                                            scanner.close();
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                