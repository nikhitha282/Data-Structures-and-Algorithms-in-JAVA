/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
*/

class ArrayIntersection2 {
       public int[] intersect(int[] nums1, int[] nums2) {
         
            Map<Integer, Integer> key_count = new HashMap<>(); //contains key and count of the key in the smaller array
            List<Integer> intersection = new ArrayList<>(); //contains intersection of both the arrays
      
            for(int i=0; i<nums1.length; i++)
                if(key_count.containsKey(nums1[i]))
                    key_count.put(nums1[i], key_count.get(nums1[i])+1); //increment count if key is encountered again
                else
                    key_count.put(nums1[i], 1); //key seen for the first time
            
            for(int i=0; i<nums2.length; i++)
                if(key_count.containsKey(nums2[i])) {
                    intersection.add(nums2[i]); //add to list if intersecting
                    key_count.put(nums2[i], key_count.get(nums2[i])-1); //decrement count in hash map
                    if(key_count.get(nums2[i]) == 0)
                        key_count.remove(nums2[i]);
                }
       
            return intersection.stream().mapToInt(i -> i).toArray();
        }
}
