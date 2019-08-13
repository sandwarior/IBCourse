/*Given an integer A representing the square blocks. The height of each square block is 1.
The task is to create a staircase of max height using these blocks. 
The first stair would require only one block, the second stair would require two blocks and so on. 
Constraints
0 <= A <= 10^9
For Example
Input 1:
    A = 10
Output 1:
    4

Input 2:
    A = 20
Output 2:
    5*/
public class Solution {
    public int solve(int A) {
        long low= 0;
        long high=((int)Math.sqrt(A))*2;
        long mid,midx;
        while(low<=high){
           // System.out.println(low+" "+high);
            mid=low+((high-low)/2);
            midx=(mid*(mid+1))/2;
          //  System.out.println(mid+" "+midx);
            if(midx==A)
            return (int)mid;
            if(midx>A)
            high=mid-1;
            else
            low=mid+1;
           //  System.out.println(low+" "+high);
        }
        return (int)high;
    }
}
