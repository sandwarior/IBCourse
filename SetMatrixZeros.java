/*Given an m x n matrix of 0s and 1s, if an element is 0, set its entire row and column to 0.  Do it in place. Example Given array A as
1 0 1
1 1 1 
1 1 1
On returning, the array A should be :
0 0 0
1 0 1
1 0 1*/

public class Solution {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
	    int row = a.size();
	    int col = a.get(0).size();
	    int[] mapRow = new int[row];
	    int[] mapCol = new int[col];
	    for(int i=0;i<row;i++){
	        for(int j=0;j<col;j++){
	            if(a.get(i).get(j)==0){
	                mapRow[i]=1;
	                mapCol[j]=1;
	            }
	        }
	    }
	    for(int i=0;i<row;i++){
	        for(int j=0;j<col;j++){
	            if(mapRow[i]==1 || mapCol[j]==1){
	               a.get(i).set(j,0);
	            }
	        }
	    }
	}
}
