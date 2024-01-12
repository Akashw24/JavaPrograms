package Array.arrayeg;

import java.util.Scanner;

public class MultiplyArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input matrix1
        int[][] matrix1 = new int[3][3];
        int[][] resultMatrix = new int[3][3];

        System.out.println("Enter matrix1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }

        // Input matrix2
        int[][] matrix2 = new int[3][3];
        System.out.println("Enter matrix2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }

        // Multiply matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Print the result matrix
        System.out.println("Result matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}

