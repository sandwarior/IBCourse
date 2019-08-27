/*Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order. Example: Given n = 3, You should return the following matrix:
[
  [ 1, 2, 3 ],
  [ 8, 9, 4 ],
  [ 7, 6, 5 ]
]*/

public class Solution {
    public int[][] generateMatrix(int A) {
        int i;
        int j;
        int min = 0;
        int max = A-1;
        int[][] arr = new int[A][A];
        int cnt=1;
        while(cnt<=(A*A)){
            if(min==max)
            arr[min][max]=cnt++;
            
            i=min;
            j=min;
            while(j<max){
                arr[i][j]=cnt;
                cnt++;
                j++;
            }
            
            while(i<max){
                arr[i][j]=cnt;
                cnt++;
                i++;
            }
            
            while(j>min){
                arr[i][j]=cnt;
                cnt++;
                j--;
            }
            
            while(i>min){
                arr[i][j]=cnt;
                cnt++;
                i--;
            }
             
            max =max-1;
            min = min+1;
            //System.out.println(min+" "+max);
            
        }
        return arr;
    }
}
