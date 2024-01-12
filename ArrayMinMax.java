package Array.arrayeg;

//todo Creating array
//*new keyword
//dataType[ ]  arrayName  =  new  dataType[ size ];
//int[ ]  myArray = new int[ 5 ];
//*Array initializer
//dataType[ ]  arrayName  = { elements }
//int[ ] myArray = { 10, 20, 30, 40 };

import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] arr = new int[10]; //array created of type int size 10
        Scanner value = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = value.nextInt();
        }

        int min_value = arr[0];
        int max_value = arr[0];

        for (int i = 0; i < 10; i++) {
            if (arr[i] < min_value) {
                min_value = arr[i];
            } else if (arr[i] > max_value) {
                max_value = arr[i];
            }
        }
        System.out.print("Greatest element in an array is " + max_value + "\n");
        System.out.print("Smallest element in an array is " + min_value);
    }
}