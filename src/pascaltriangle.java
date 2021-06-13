/*Pascal Triangle
        Given numRows, generate the first numRows of Pascal's triangle.

        Pascal's triangle : To generate A[C] in row R, sum up A'[C] and A'[C-1] from previous row R - 1.

        Example:

        Given numRows = 5,

        Return

        [
        [1],
        [1,1],
        [1,2,1],
        [1,3,3,1],
        [1,4,6,4,1]
        ]*/


import java.util.ArrayList;

public class pascaltriangle {
    public static void main(String[] args) {
        int A = 5;
        int res[][] = new int[A][];
        for (int i = 0; i < A; i++) {
            int a[] = new int[i + 1];
            //ArrayList<Integer> a = new ArrayList<>();
            a[0] = 1;
            a[a.length - 1] = 1;
            if (i >= 2) {
                int temp[] = res[i - 1].clone();
                for (int j = 1; j < i; j++) {
                    a[j] = temp[j] + temp[j - 1];
                    //a.set(j,r);
                    //System.out.print(a[j]+"  ");
                }
            }
            ArrayList<Integer> al = new ArrayList<>();
            for (int k = 0; k < a.length; k++)
                al.add(a[k]);
            int arr[] = al.stream().mapToInt(m -> m).toArray();
            res[i] = arr;
        }
        //return res;
    }
}
