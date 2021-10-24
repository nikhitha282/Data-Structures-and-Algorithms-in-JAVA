/*
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 
Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
*/

import java.util.*;

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character, Character> hashmap = new HashMap<>();
        Set<Character> hashset = new HashSet<>();
        
        char a,b;
        
        for(int i=0; i<s.length(); i++) {
            
            a = s.charAt(i);
            b = t.charAt(i);
            
            if(hashmap.containsKey(b))
                if(hashmap.get(b) == a)
                    continue;
                else return false;
            else
                if(hashset.contains(a)) return false;
                else {
                    hashmap.put(b, a);
                    hashset.add(a);
                }
        }
        return true;
    }
}
