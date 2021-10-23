//This program uses hashset to return an array of intersection of two arrays.

import java.util.*;

public class ArrayIntersection {

	public static void main(String[] args) {
		int[] arr1 = {1, 1, 2, 3, 4, 4, 5, 6, 6, 3, 2};
		int[] arr2 = {1, 3, 4, 4, 6, 2, 2, 1, 9, 8};
		for(Integer i: intersection(arr1, arr2))
			System.out.print(i + " ");
	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hashset = new HashSet<>();
        List<Integer> list = new ArrayList<Integer>();
        //add all elements of nums1 in hashset
        for(Integer i: nums1)
        	if(!hashset.contains(i))
        		hashset.add(i);
        //if element in nums2 is present in hashset. add it to list and remove from hashset
        //removal is required to avoid duplicates in the list
        for(Integer i: nums2)
        	if(hashset.contains(i)) {
        		list.add(i);
        		hashset.remove(i);
        	}
        //list to array conversion      
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}
