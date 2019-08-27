/*Implement the next permutation, which rearranges numbers into the numerically next greater permutation of numbers. If such arrangement is not possible, it must be rearranged as the lowest possible order ie, sorted in an ascending order. The replacement must be in-place, do not allocate extra memory. Examples:
1,2,3 → 1,3,2

3,2,1 → 1,2,3

1,1,5 → 1,5,1*/

public class Solution {
	public void nextPermutation(ArrayList<Integer> a) {
	    int size = a.size();
	    int i;
	    int min;
	    int index=0;
	    for(i=size-1;i>0;i--){
	       // System.out.println("min "+min+" index "+index+" i "+i );
	        int j=i;
	        if(a.get(i)>a.get(i-1)){
	            min = a.get(i);
	            while(j<size){
	               // System.out.println("min "+min+" index "+index+" i "+i );
	                if(min>=a.get(j)&& a.get(j)>a.get(i-1)){
	                min=a.get(j);
	                index = j;
	                }
	                j++;
	            }
	            int temp = a.get(index);
	            
	            a.remove(index);
	            a.add(i-1,temp);
	            break;
	        }
	        
	    }
	    Collections.sort(a.subList(i,size));

	}
}
