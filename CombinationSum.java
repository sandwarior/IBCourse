/*Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T. The same repeated number may be chosen from C unlimited number of times.
 Note:
All numbers (including target) will be positive integers.
Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
The combinations themselves must be sorted in ascending order.
CombinationA > CombinationB iff (a1 > b1) OR (a1 = b1 AND a2 > b2) OR ... (a1 = b1 AND a2 = b2 AND ... ai = bi AND ai+1 > bi+1)
The solution set must not contain duplicate combinations.
Example, Given candidate set 2,3,6,7 and target 7, A solution set is:
[2, 2, 3]
[7]*/

public class Solution {
    ArrayList<ArrayList<Integer>> arr= new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        ArrayList<Integer> C = new ArrayList<Integer>();
        int sum=0;
        int x=0;
        Collections.sort(A);
        combinationS(A,B,C,sum,x);
        return arr;
    }
    
    public void combinationS(ArrayList<Integer> a,int b,ArrayList<Integer> c,int sum,int x){
        int size = a.size();
        int i=x;
        for( i=x;i<size;i++){
            if(a.indexOf(a.get(i))<i)
            continue;
            sum+=a.get(i);
            if(sum>b){
                sum -= a.get(i);
                continue;
            }
            if(sum==b){
                c.add(a.get(i));
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.addAll(c);
                arr.add(list);
                c.remove(a.get(i));
                sum -= a.get(i);
                continue;
            }
            if(sum<b){
                c.add(a.get(i));
                combinationS(a,b,c,sum,i);
                c.remove(a.get(i));
                sum -= a.get(i);
            }
        }
    }
}
