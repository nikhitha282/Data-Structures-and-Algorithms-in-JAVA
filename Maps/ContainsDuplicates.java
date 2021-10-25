/*
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
*/

class ContainsDuplicates {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      
        Map<Integer, Integer> key_index = new HashMap<>(); //stores key and index
        
        for(int i=0; i<nums.length; i++)
            if(key_index.containsKey(nums[i]))
                if(i-key_index.get(nums[i]) <= k)
                    return true;
                else
                    key_index.put(nums[i], i); //update index if key is present in hash map but difference between indices is greater than k
            else
                key_index.put(nums[i], i);
        
        return false;
    }
}
