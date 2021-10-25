/*
Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings.

You need to help them find out their common interest with the least list index sum. If there is a choice tie between answers, output all of them with no order requirement. You could assume there always exists an answer.

Example 1:
Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"]
Output: ["Shogun"]
Explanation: The only restaurant they both like is "Shogun".

Example 2:
Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["KFC","Burger King","Tapioca Express","Shogun"]
Output: ["KFC","Burger King","Tapioca Express","Shogun"]

Constraints:
1 <= list1.length, list2.length <= 1000
1 <= list1[i].length, list2[i].length <= 30
list1[i] and list2[i] consist of spaces ' ' and English letters.
All the strings of list1 are unique.
All the strings of list2 are unique.
*/

class MinIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        Map<String, Integer> intersection = new HashMap<>();
        Map<String, Integer> preference = new HashMap<>();
        Set<String> set_preferred = new HashSet<>();
        int highest_preference = Integer.MAX_VALUE;
        
        for(int i=0; i<list1.length; i++)
            intersection.put(list1[i], i);
        
        for(int i=0; i<list2.length; i++) {
            if(intersection.containsKey(list2[i])) {
                preference.put(list2[i], i+intersection.get(list2[i]));
            }
        }
        
        for(Map.Entry<String, Integer> entry : preference.entrySet()) {
            if(entry.getValue() < highest_preference) {
                highest_preference = entry.getValue();
            }
        }
        
        for(Map.Entry<String, Integer> entry : preference.entrySet()) {
            if(entry.getValue() == highest_preference) {
                set_preferred.add(entry.getKey());
            }
        }
        
        String[] arr_preferred = new String[set_preferred.size()];
        
        return set_preferred.toArray(arr_preferred);
        
    }
}
