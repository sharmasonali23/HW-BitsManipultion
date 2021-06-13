/*Spiral Order Matrix II
        Problem Description

        Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order.



        Problem Constraints
        1 <= A <= 1000



        Input Format
        First and only argument is integer A


        Output Format
        Return a 2-D matrix which consists of the elements in spiral order.



        Example Input
        Input 1:

        1
        Input 2:

        2


        Example Output
        Output 1:

        [ [1] ]
        Output 2:

        [ [1, 2], [4, 3] ]


        Example Explanation
        Explanation 1:


        Only 1 is to be arranged.
        Explanation 2:

        1 --> 2
        |
        |
        4<--- 3*/
public class spiralOrderMatrix {
    public static void main(String[] args) {
        int A = 2;
        int res[][] = new int[A][A];
         /*for(int i=0;i<A;i++){
             for(int j=0;j<A;j++)
                 res[i][j]=0;
         }*/
        //System.out.print(res);
        int num = 0;
        int t = 0;
        int l = 0;
        int b = A - 1;
        int r = A - 1;
        // System.out.print(b+" "+r);
        while (t <= b && l <= r) {
            for (int i = l; i <= r; i++) {
                num += 1;
                res[t][i] = num;
                // System.out.print(num+" ");
            }
            t += 1;
            for (int j = t; j <= b; j++) {
                num += 1;
                res[j][r] = num;
            }
            r -= 1;
            for (int k = r; k >= l; k--) {
                num += 1;
                res[b][k] = num;
            }
            b -= 1;
            for (int q = b; q >= t; q--) {
                num += 1;
                res[q][l] = num;
            }
            l += 1;
        }
        //return res;
    }
}

