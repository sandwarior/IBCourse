/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].


Solution:*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int len = nums.length;
        for(int i =0; i<len;i++){
            map.put(nums[i],i);
        }
        int arr[] = new int[2];
        for(int i=0;i<len;i++){
            if(map.containsKey(target-nums[i])){
                arr[0]=i;
                arr[1]=map.get(target-nums[i]);
                if(i!=map.get(target-nums[i]))
                break;
            }
        }
        return arr;
    }
}
