/*Given an unsorted array, find the maximum difference between the successive elements in its sorted form. Try to solve it in linear time/space. Example :
Input : [1, 10, 5]
Output : 5 
Return 0 if the array contains less than 2 elements.*/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maximumGap(final int[] A) {
        int len=A.length;
        int buckets = 0;
        int sum=0;
        int count = 0;
        int a;
        if(len < 2)
        return 0;
        HashSet<Integer> set =  new HashSet<Integer>();
        int min=A[0];
        int max=A[0];
        for(int i=0;i<len;i++){
            set.add(A[i]);
            if(A[i]<min)
            min=A[i];
            if(A[i]>max)
            max=A[i];
        }
        int size = set.size();
        if(size < 2)
        return 0;
        int gap = size-1;
        //System.out.println(gap);
       // System.out.println(size);
        //System.out.println(max+ " "+min);
        buckets  = (int)(Math.ceil((double)(max-min)/gap));
       // System.out.println(buckets);
        int arrMin[] = new int[size+1];
        int arrMax[] = new int[size+1];
        
        for(int i=0;i<len;i++){
            a = (int)Math.ceil((A[i]-min)/buckets);
            a= a;
            if(A[i]<arrMin[a] || arrMin[a]==0)
            arrMin[a]=A[i];
            if(A[i]>arrMax[a])
            arrMax[a]=A[i];
        }
        int j =0;
        int diff = 0;
       /*for(int i=0;i<len+1;i++){
            System.out.println(arrMin[i]+ " " + arrMax[i]);
        }*/
        for(int i=1;i<size+1;i++){
            while(i<size+1 && arrMin[i] == 0){
            i++;
            }
            if(i<size+1){
            diff = arrMin[i]-arrMax[j];
            if(diff>sum)
            sum=diff;
            j=i;
            }
        }
        return sum;
    }
}
