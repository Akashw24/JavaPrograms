package Array.arrayeg;

//
//public class Multiarray {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[][] matrix = new int[2][3]; //array created of 2 rows and column
//        for(int i = 0; i < 2 ; i++){
//            for (int j = 0; j < 3; j++) {
//                System.out.print("matrix[" + i + "][" + j + "]: ");
//                matrix[i][j] = input.nextInt();
//            }
//        }
//    }
//}

import java.util.Scanner;

public class MultiarrayMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix1 = new int[2][3]; //array created of 2 rows and column
        int[][] matrix2 = new int[2][3]; //array created of 2 rows and column
        int[][] sum = new int[2][3];

        // Get the values of the matrices from the user
        System.out.println("Enter the values of the first matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println();

        System.out.println("Enter the values of the second matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Add the matrices and store the result in the 'sum' matrix
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display the result
        System.out.println("The sum of the matrices is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}















