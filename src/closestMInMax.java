/*Closest MinMax
        Problem Description

        Given an array A. Find the size of the smallest subarray such that it contains atleast one occurrence of the maximum value of the array

        and atleast one occurrence of the minimum value of the array.



        Problem Constraints
        1 <= |A| <= 2000



        Input Format
        First and only argument is vector A



        Output Format
        Return the length of the smallest subarray which has atleast one occurrence of minimum and maximum element of the array



        Example Input
        Input 1:

        A = [1, 3]
        Input 2:

        A = [2]


        Example Output
        Output 1:

        2
        Output 2:

        1


        Example Explanation
        Explanation 1:

        Only choice is to take both elements.
        Explanation 2:

        Take the whole array.*/

public class closestMInMax {
    public static void main(String[] args) {
        int A[]={1,2,9,7};
        int min=Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;

        for(int i=0;i<A.length;i++){
            max=max<A[i]?A[i]:max;
            min=min>A[i]?A[i]:min;
        }
        if(min==max) {
            //return 1;
            System.out.println("1");
        }
        int l_max =-1;int r_max=-1;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i]==max)
                l_max=i;
            else if(A[i]==min && l_max!=-1)
                ans=Math.min(ans,i-l_max+1);
        }
        for(int i=A.length-1;i>=0;i--){
            if(A[i]==max)
                r_max=i;
            else if(A[i]==min && r_max!=-1)
                ans=Math.min(ans,r_max-i+1);
        }
        //return ans;
    }
}
