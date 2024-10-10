import java.util.Scanner;

// public class array2d {

//     public static boolean search(int matrix[][], int key) {
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 if (matrix[i][j] == key) {
//                     System.out.println("found at cell (" + i + "," + j + ")");
//                     return true;
//                 }
//             }
//         }
//         System.out.println("key not found");
//         return false;
//     }

//     public static void main(String[] args) {
//         int matrix[][] = new int[3][3];
//         int n = matrix.length, m = matrix[0].length;
//         Scanner sc = new Scanner(System.in);
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         // output
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }

//         search(matrix, 5);

//     }
// }

// question 1
// Print the number of 7’s that are in the 2d array.
// Example :
// Input - int[][] array = { {4,7,8},{8,8,7} };
// Output - 2

// public class array2d {
//     public static void main(String[] args) {
//         int[][] array = { { 4, 7, 8 }, { 8, 8, 7 } };
//         int countOf7 = 0;
//         for (int i = 0; i < array.length; i++) {
//             for (int j = 0; j < array[0].length; j++) {
//                 if (array[i][j] == 7) {
//                     countOf7++;
//                 }
//             }
//         }
//         System.out.println("count of 7 is : " + countOf7);
//     }
// }

// Question 2 : Print out the sum of the numbers in the second row of the “nums” array.
// Example :
// Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
// Output - 18

// public class array2d {
//     public static void main(String[] args) {
//         int[][] nums = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
//         int sum = 0;
//         // sum of 2nd row elements
//         for (int j = 0; j < nums[0].length; j++) {
//             sum += nums[1][j];
//         }
//         System.out.println("sum is : " + sum);
//     }
// }

// Question 3 : Write a program to Find Transpose of a Matrix.
// What is Transpose?
// Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,
// Matrix
// a11 a12 a13
// a21 a22 a23
// Transposed Matrix
// a11 a21
// a12 a22
// a13 a23

public class array2d {
    public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = { { 2, 3, 7 }, { 5, 6, 7 } };
        // Display original matrix
        printMatrix(matrix);
        // Transpose the matrix
        int[][] transpose = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        // print the transposed matrix
        printMatrix(transpose);
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("The matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
