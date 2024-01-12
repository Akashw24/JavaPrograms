package Array.arrayeg;
//*1. Write a Java program to sum values of an array.

//public class ArrayEg1 {
//
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5};
//        int sum = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        System.out.println("The sum of the array is: " + sum);
//    }
//}

////2. Write a Java program to calculate the average value of array elements.
//
//public class ArrayEg1 {
//    public static void main(String[] args) {
//        int[] array = {10, 23, 53, 54, 75};
//        double sum = 0.0;
//
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//
//        double average = sum / array.length;
//
//        System.out.println("The average of the array is: " + average);
//    }
//}
//
//*-3. Write a Java program to reverse an array of integer values.

public class ArrayEg1 {
    public static void main(String[] args) {
        int[] array = { 9, 2, 3, 4, 5 };
        int length = array.length;

        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - i - 1];
            //storing 9,2
            array[length - i - 1] = temp;
            //storing 5,4
        }



        System.out.print("The reversed array is: ");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

//
////4. Write a Java program to find the maximum and minimum value of an array.
//
//public class ArrayEg1 {
//    public static void main(String[] args) {
//        int[] array = { 60, 12, 39, 74, 85 };
//        int max = array[0];
//        int min = array[0];
//
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//
//        System.out.println("The maximum value in the array is: " + max);
//        System.out.println("The minimum value in the array is: " + min);
//    }
//}


//public class ArrayEg1 {
//    public static void main(String[] args) {
//        int[] arr = {22,23,24,25,26};
//        int size = arr.length;
//        int sum = 0;
//        for (int i = 0; i < size; i++){
//            sum = sum + arr[i];
//        }
//        System.out.println(sum);
//    }
//}














