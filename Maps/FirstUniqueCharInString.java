/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1
*/

class FirstUniqueCharInString {
    public int firstUniqChar(String s) {
        
        Map<Character, Integer> index_table = new HashMap<>(); //contains all unrepeated characters and their indices
        Set<Character> removed = new HashSet<>();
        int min_index = Integer.MAX_VALUE;
        char c;
        
        for(int i=0; i<s.length(); i++) {
            c = s.charAt(i);
            
            if(!index_table.containsKey(c) && !removed.contains(c)) //if it is unseen so far
                index_table.put(c, i);
            
            else if(index_table.containsKey(c)) {
                index_table.remove(c); //hash map stores only unrepeated characters
                removed.add(c); //to check if it is seen before
            }
        }
        
        if(index_table.isEmpty()) //all characters are repeated in the string
            return -1;
        else {
            for(Map.Entry<Character, Integer> entry : index_table.entrySet()) {
                if(entry.getValue() < min_index)
                    min_index = entry.getValue(); //finding first unrepeated character
            }
            return min_index;
        }
    }
}
