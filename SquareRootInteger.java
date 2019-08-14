/*Implement int sqrt(int x). Compute and return the square root of x. If x is not a perfect square, return floor(sqrt(x)) Example :
Input : 11
Output : 3
*/

public class Solution {
	public int sqrt(int a) {
	    if(a==0)
	    return 0;
	    int low=1;
	    int high =a/2+1;
	    int mid;
	    long midx;
	    while(high-low>1){
	       // System.out.println(low+" "+high);
	        mid = low+(high-low)/2;
	        midx =a/mid;
	       // System.out.println(mid+" "+midx);
	        if(midx==mid)
	        return mid;
	        if(midx<mid)
	        high=mid;
	        else
	        low=mid;
	        //System.out.println(low+" "+high);
	    }
	    return low;
	}
}
