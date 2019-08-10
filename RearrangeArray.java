/*Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra space. Example:
Input : [1, 0]
Return : [0, 1]*/


public class Solution {
	public void arrange(ArrayList<Integer> a) {
	    int len = a.size();
	    
	    for(int i=0;i<len;i++){
	    //	System.out.println("a"+a.get(i)+"i"+i);
	        if(a.get(i)!=i && a.get(i)>=0 ){
	            int temp=a.get(i);
	            int temp1 =temp;
	            int index = i;
	            while(a.get(temp1)>=0){
	                a.set(index,(a.get(temp1)+1)*-1);
	              //  System.out.println(a);
	                index = temp1;
	                temp1 = a.get(index);
	            }
	            a.set(index,(temp+1)*-1);
	        }
	    }
	    int temp;
	    for(int i=0;i<len;i++){
	        temp = a.get(i);
	        if(temp<0)
	        a.set(i,temp*-1-1);
	    }
	   // System.out.println(a);
	}
}
