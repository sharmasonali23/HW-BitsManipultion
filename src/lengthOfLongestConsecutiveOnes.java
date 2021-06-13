/*Length of longest consecutive ones
        Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.


        Input Format

        The only argument given is string A.
        Output Format

        Return the length of the longest consecutive 1’s that can be achieved.
        Constraints

        1 <= length of string <= 1000000
        A contains only characters 0 and 1.
        For Example

        Input 1:
        A = "111000"
        Output 1:
        3

        Input 2:
        A = "111011101"
        Output 2:
        7*/


public class lengthOfLongestConsecutiveOnes {
    public static void main(String[] args) {
        String A="111011101";
        char c[] = A.toCharArray();
        int countOne=0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='1')
                countOne+=1;
        }
        int l []= new int[A.length()];
        int r []= new int[A.length()];
        l[0]=0;r[c.length-1]=0;
        for(int i=1;i<c.length;i++){
            if(c[i-1]=='0')
                l[i]=0;
            else if(c[i-1]=='1')
                l[i]=l[i-1]+1;
        }
        for(int i=c.length-2;i>=0;i--){
            if(c[i+1]=='0')
                r[i]=0;
            else if(c[i+1]=='1')
                r[i]=r[i+1]+1;
        }
        int ans=0;int sum=0;
        for(int i=0;i<l.length;i++){
            //System.out.print(l[i]+"  "+r[i]);
            sum=Math.max(sum,l[i]+r[i]+1);
            sum=sum>countOne?sum-1:sum;
        }

        //return sum;
    }
}
