package Array.arrayeg;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = scanner.nextInt();

        System.out.println("Enter the elements of an array");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
             arr[i] = scanner.nextInt();
        }

        System.out.println("Entered elements");
        for (int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }

        System.out.println("The reverse array is");
        for (int i = arr.length -1; i>=0 ; i--){
            System.out.println(arr[i]);
        }
    }
}
