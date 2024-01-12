package Array.arrayeg;
//Date 20-03-2023

//Addition and Subtraction of an Array
//public class ArrayEg3 {
//    public static void main(String args[]) {
//        //creating two matrices
//        //3 rows and 3 columns
//        int[][] arr1 = {{7, 7, 7}, {8, 8, 8}, {9, 9, 9}};
//        int[][] arr2 = {{10, 10, 10}, {5, 5, 5}, {6, 6, 6}};
//
//
//        //creating another matrix to store the sum of two matrices
//        int[][] result = new int[3][3];
//
//        for (int i = 0; i < 3; i++) {             //Here for each iteration Outer loop is running 1 time
//            for (int j = 0; j < 3; j++) {          // Here for each iteration inner loop is running 3 times
//                result[i][j] = arr1[i][j] + arr2[i][j];
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();//new line
//        }
//
//    }
//}


//Multiplication of an Array
public class ArrayEg3 {
    public static void main(String[] args) {
        //creating two matrices
        int[][] a = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int[][] b = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};

        //*1ST row of 1st matrix * 1st column of 2nd matrix

//creating another matrix to store the multiplication of two matrices
        int[][] c = new int[3][3];  //3 rows and 3 columns

//multiplying and printing multiplication of 2 matrices
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }//end of k loop
                System.out.print(c[i][j] + " ");  //printing matrix element
            }//end of j loop
            System.out.println();//new line
        }
    }
}

//public class ArrayEg3 {
//    public static void main(String[] args) {
//        int[][] a={{1,1,1},{2,2,2}{3,3,3}};
//
//    }
//}































