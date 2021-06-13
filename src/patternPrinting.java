/*Pattern Printing -2
        Problem Description

        Print a Pattern According to The Given Value of A.

        Example: For A = 3 pattern looks like:

        1
        2 1
        3 2 1


        Problem Constraints
        1 <= A <= 1000


        Input Format
        First and only argument is an integer denoting A.



        Output Format
        Return a two-dimensional array where each row in the returned array represents a row in the pattern.



        Example Input
        Input 1:

        A = 3
        Input 2:

        A = 4


        Example Output
        Output :1

        [
        [0, 0, 1]
        [0, 2, 1]
        [3, 2, 1]
        ]
        Output 2:

        [
        [0, 0, 0, 1]
        [0, 0, 2, 1]
        [0, 3, 2, 1]
        [4, 3, 2, 1]
        ]*/

public class patternPrinting {
    public static void main(String[] args) {
        int A = 4;
        int res[][] = new int[A][A];
        for (int i = 0; i < A; i++) {
            int num = 0;
            for (int j = A - 1; j >= A - i - 1; j--) {
                num += 1;
                res[i][j] = num;
            }
        }
        //return res;
    }
}
