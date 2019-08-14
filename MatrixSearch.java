/*Matrix Search
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
Integers in each row are sorted from left to right.
The first integer of each row is greater than or equal to the last integer of the previous row.
Example: Consider the following matrix:
[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
Given target = 3, return 1 ( 1 corresponds to true ) 
Return 0 / 1 ( 0 if the element is not present, 1 if the element is present ) for this problem
*/

public class Solution {
	public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
	    int len=a.size();
	    int low=0;
	    int high=len-1;
	    int mid;
	    int row;
	    while(low<=high){
	        mid = (high+low)/2;
	        if(a.get(mid).get(0)==b)
	        return 1;
	        if(a.get(mid).get(0)>b)
	        high=mid-1;
	        else
	        low =mid+1;
	    }
	    row = high;
	    if(row<0 || row>=len)
	    return 0;
	    low=0;
	  //  System.out.println(row);
	    high = a.get(row).size()-1;
	    while(low<=high){
	        mid = (high+low)/2;
	        if(a.get(row).get(mid)==b)
	        return 1;
	        if(a.get(row).get(mid)>b)
	        high=mid-1;
	        else
	        low =mid+1;
	    }
	    return 0;
	}
}
