/*Find the largest continuous sequence in a array which sums to zero. Example:
Input:  {1 ,2 ,-2 ,4 ,-4}
Output: {2 ,-2 ,4 ,-4}*/

public class Solution {
    public ArrayList<Integer> lszero(ArrayList<Integer> A) {
        int size = A.size();
        HashMap<Long,Integer[]> hash = new HashMap<Long,Integer[]>();
        hash.put(0L,new Integer[]{-1,-1});
        int max=0;
        ArrayList<Long> arr = new ArrayList<Long>();
        arr.add(0,(long)A.get(0));
        for(int i=1;i<size;i++){
            arr.add(i,(long)A.get(i)+arr.get(i-1));
        }
       
       // System.out.println(arr);
        for(int i=0;i<size;i++){
            long x = arr.get(i);
            if(hash.containsKey(x)){
                Integer[] arr1 = hash.get(x);
                 arr1[1]=i;
                hash.put(x,arr1);
                if(max<(i-arr1[0]))
                max=i-arr1[0];
            }
            else{
              Integer[] arr1 =  new Integer[2]; 
              arr1[0]=i;
              arr1[1]=i;
              hash.put(x,arr1);
            }
            
        }
       /* for(long i : hash.keySet()){
            int x = hash.get(i)[0];
            int y = hash.get(i)[1];
            System.out.println("i"+i+"x"+x+"y"+y);
        }*/
        int minx = size;
         ArrayList<Integer> result = new ArrayList<Integer>();
        for(long i : hash.keySet()){
            int x = hash.get(i)[0];
            int y = hash.get(i)[1];
            if(max==(y-x) && x<minx){
            if(minx==size){
            for(int j=x+1;j<=y;j++)
            result.add(A.get(j));
            }
            else
            {
            for(int j=x+1;j<=y;j++)
            result.set(j-x-1,A.get(j));
            }
            minx=x;
            }
        }
        return result;
    }
}
