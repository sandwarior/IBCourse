/*Given a collection of numbers, return all possible permutations. Example: [1,2,3] will have the following permutations:
[1,2,3]
[1,3,2]
[2,1,3] 
[2,3,1] 
[3,1,2] 
[3,2,1]*/

public class Solution {
    ArrayList<ArrayList<Integer>> arr= new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        permutation(A,0);
        return arr;
    }
    
    public void permutation(ArrayList<Integer> A,int x){
        int size = A.size();
        int temp;
        //System.out.println("A="+A);
        if(x==size){
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.addAll(A);
            arr.add(list);
        }
        else{
        permutation(A,x+1);
        for(int i=x+1;i<size;i++){
            temp = A.get(i);
            A.set(i,A.get(x));
            A.set(x,temp);
           // System.out.println("A="+A);
            permutation(A,x+1);
            temp = A.get(i);
            A.set(i,A.get(x));
            A.set(x,temp);
        }
        }
    }
}
