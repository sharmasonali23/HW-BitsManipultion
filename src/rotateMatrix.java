/*Rotate Matrix
        Problem Description

        You are given a n x n 2D matrix A representing an image.

        Rotate the image by 90 degrees (clockwise).

        You need to do this in place.

        Note: If you end up using an additional array, you will only receive partial score.



        Problem Constraints
        1 <= n <= 1000



        Input Format
        First argument is a 2D matrix A of integers



        Output Format
        Return the 2D rotated matrix.



        Example Input
        Input 1:

        [
        [1, 2],
        [3, 4]
        ]
        Input 2:

        [
        [1]
        ]


        Example Output
        Output 1:

        [
        [3, 1],
        [4, 2]
        ]
        Output 2:

        [
        [1]
        ]*/

public class rotateMatrix {
    public static void main(String[] args) {
        int A[][] = {{1, 2}, {3, 4}};
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][A.length - j - 1];
                A[i][A.length - j - 1] = temp;
            }
        }

    }
}
