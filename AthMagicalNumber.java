/*Given three positive integers A, B and C. A positive integer is magical if it is divisible by either A or B. 
Return the A-th magical number. Since the answer may be very large, return it modulo 109 + 7. 
Constraints
1 <= A <= 10^9
2 <= B, C <= 40000 
For Example
Input 1:
    A = 1
    B = 2
    C = 3
Output 1:
    2
    Explanation 1:
        1st magical number is 2.*/

public class Solution {
    public int solve(int A, int B, int C) {
        long low =(long)Math.min(B,C);
        long high =((long)Math.max(B,C))*A;
        long div = low;
        long dvd = (long)Math.max(B,C);
        long temp;
        while(dvd%div!=0){
            temp=dvd%div;
            dvd = div;
            div=temp;
        }
        long lcm = (B*C)/div;
        long mid,midx;
        while(low<=high){
           // System.out.println(low+" "+high);
            mid = (high+low)/2;
            midx = (mid/B)+(mid/C)-(mid/lcm);
           // System.out.println(mid+" "+midx);
            if(midx==A && (mid%B==0 || mid%C==0) )
            return (int)(mid%1000000007);
            else if(midx>A)
            high=mid-1;
            else if(midx<A)
            low=mid+1;
            else
            high=mid-1;
            //System.out.println(low+" "+high);
        }
        return 0;
    }
}
