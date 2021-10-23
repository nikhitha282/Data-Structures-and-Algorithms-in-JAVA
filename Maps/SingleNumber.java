//This function uses hash set to return the element occuring only once in an array where rest of the elements occur twice.

class SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> hashset = new HashSet<>();
        
        for(Integer key: nums) {
            if(!hashset.contains(key)) hashset.add(key);
            else hashset.remove(key);
        }
        
        Iterator<Integer> i = hashset.iterator();
        return (int)i.next();
    }
}
