//Hash Set implementation without using standard libraries
//Constraints: 0 <= key <= 10^6

class MyHashSet {
    private int[] hashSet;
    
    public MyHashSet() {
        hashSet = new int[1000001];
        Arrays.fill(hashSet, -1); //-1 to indicate no value at the index
    }
    
    public void add(int key) {
        hashSet[key] = key;
    }
    
    public void remove(int key) {
        if(contains(key))
            hashSet[key] = -1;
    }
    
    public boolean contains(int key) {
        if(hashSet[key] != -1)
            return true;
        return false;
    }
}
