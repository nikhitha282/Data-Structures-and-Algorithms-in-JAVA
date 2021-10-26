/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
*/

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
		
        Map<String, ArrayList<String>> anagrams = new HashMap<>(); //hash table stores key(sorted string) and values(list of anagrams)
        List<List<String>> solution = new ArrayList<List<String>>(); //return values
        
        for(String str : strs) {
            String hash = hash(str); //calculate hash key
            if(anagrams.containsKey(hash)) { //if key is present in the hash table, add current string in the list of anagrams
            	anagrams.get(hash).add(str);
            }
            else {
            	anagrams.put(hash, new ArrayList<String>()); //else, create key value pair
                anagrams.get(hash).add(str);
            }
        }
        
        for(Map.Entry<String, ArrayList<String>> entry : anagrams.entrySet()) {
        	solution.add(entry.getValue()); //return all the list of anagrams
        }
        
        return solution;
    }
	
	  public String hash(String str) { //hash key is the sorted string
		  char[] temp = str.toCharArray();
		  Arrays.sort(temp);
		  return new String(temp);
	  }
}
