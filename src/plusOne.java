import java.util.ArrayList;

/*
Add One To Number
        Problem Description

        Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).

        The digits are stored such that the most significant digit is at the head of the list.

        NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example: for this problem, following are some good questions to ask :

        Q : Can the input have 0's before the most significant digit. Or in other words, is 0 1 2 3 a valid input?
        A : For the purpose of this question, YES
        Q : Can the output have 0's before the most significant digit? Or in other words, is 0 1 2 4 a valid output?
        A : For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.


        Problem Constraints
        1 <= size of the array <= 1000000



        Input Format
        First argument is an array of digits.



        Output Format
        Return the array of digits after adding one.



        Example Input
        Input 1:

        [1, 2, 3]


        Example Output
        Output 1:

        [1, 2, 4]


        Example Explanation
        Explanation 1:

        Given vector is [1, 2, 3].
        The returned vector should be [1, 2, 4] as 123 + 1 = 124.*/
public class plusOne {
    public static void main(String[] args) {
          int A[]={1, 2, 3};
            //if(A.length==1){
            int idx = 0;
            for(int i=0;i<A.length;i++){
                if(A[i]!=0){
                    idx=i;break;
                }
            }
            int carry=0;int digit =0;
            ArrayList<Integer> a = new ArrayList<>();
            for(int i=A.length-1;i>=idx;i--){
                int num=A[i]+carry;
                if(i==A.length-1)
                    num=num+1;
                //num=num+carry
                carry = num>=10?num/10:0;

                digit = num>=10?num%10:num;
                a.add(digit);
                //System.out.print(digit+" ");
            }
            if(carry!=0)
                a.add(carry);

            int res [] = new int[a.size()];
            //int k=0;
            for(int i=0;i<a.size();i++){
                //System.out.print(a.get(i)+" ");
                res[a.size()-i-1]=a.get(i);
            }

            //return res;
        }
    }

