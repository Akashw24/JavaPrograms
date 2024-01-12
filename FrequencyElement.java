package Array.arrayeg;


import java.util.Scanner;

public class FrequencyElement {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initialize array
        int[] arr = new int[size];

        // Ask the user to enter elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Close the Scanner to prevent resource leak
        scanner.close();

        // Array fr will store frequencies of element
        int[] fr = new int[arr.length];
        int visited = -1;

        // Loop to find frequencies
        for (int i = 0; i < arr.length; i++) {
            int count = 1; // Initialize count for the current element

            // Nested loop to compare the current element with the rest of the array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++; // Increment count if the same element is found
                    // To avoid counting the same element again
                    fr[j] = visited; // Mark the position as visited ex if i[0] = 2 and j[2] = 2 then at position j[2] == -1
                }
            }

            // If the current element is not visited, set its frequency in the 'fr' array
            if (fr[i] != visited)
                fr[i] = count;
        }

        // Display the frequency of each element present in the array
        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + fr[i]);
        }
        System.out.println("----------------------------------------");
    }
}

