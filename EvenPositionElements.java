package Array.arrayeg;

import java.util.Scanner;

public class EvenPositionElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i<size;i++){
            System.out.print("Element at position " + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Elements at even positions:");
        printEvenPositionElements(array);
        scanner.close();

    }

    private static void printEvenPositionElements(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println("Position " + i + ": " + arr[i]);
        }
    }
}
