package Array.arrayeg;
//This Java program is designed to calculate and analyze the marks of a group of students. It takes input from the user for the number of students, their names,
// and their total marks. Then, it calculates the average of the total marks and displays the deviation of each student's total marks from the calculated average.

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int N = input.nextInt();

        String[] name = new String[N];
        int[] totalmarks = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            System.out.println("Enter the name of student " + (i + 1) + ": ");
            name[i] = input.next();
            System.out.print("Enter the total marks of student " + (i + 1) + ": ");
            totalmarks[i] = input.nextInt();
            sum += totalmarks[i];
        }

        double average = (double) sum / N;
        System.out.printf("Average of total marks: %.2f%n", average);


        System.out.println("Deviation of each student's total marks with the average:");
        for (int i = 0; i < N; i++) {
            double deviation = totalmarks[i] - average;
            System.out.println(name[i] + " : " + deviation);
        }
    }
}











