/*Suppose a sorted array is rotated at some pivot unknown to you beforehand. (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2 ). You are given a target value to search. If found in the array, return its index, otherwise return -1. You may assume no duplicate exists in the array.
Input : [4 5 6 7 0 1 2] and target = 4
Output : 0*/

public class Solution {
	// DO NOT MODIFY THE LIST
	public int search(final List<Integer> a, int b) {
	    int len = a.size();
	    int key = b;
	    int low = 0;
	    int high = len-1;
	    int mid;
	    int midx;
	    int flag=0;
	    while(low<=high){
	       // System.out.println(low+" "+high);
           //System.out.println(flag);
	        mid = low+((high-low)/2);
	        midx=a.get(mid);
	        if(midx==key)
	        return mid;
	       // System.out.println(mid+" "+midx);
	        if(flag==0){
	        if(midx<a.get(low) && key>midx && key<=a.get(high)){
	            flag=1;
	            low=mid+1;
	        }
	        else if(midx>=a.get(low) && key<midx && key>=a.get(low)){
	            flag=1;
	            high=mid-1;
	        }
	        else if(midx<a.get(low))
	        high = mid-1;
	        else
	        low=mid+1;
	        }
	        else if(flag==1){
	            if(key>midx)
	            low=mid+1;
	            else
	            high=mid-1;
	        }
	        //System.out.println(low+" "+high);
	    }
	    return -1;
	}
}
