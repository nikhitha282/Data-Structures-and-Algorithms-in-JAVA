//Hash Set implementation without using standard libraries
//Constraints: 0 <= key <= 10^6

class MyHashSet {
    private boolean hashSet;
    
    public MyHashSet() {
        hashSet = new int[1000001];
    }
    
    public void add(int key) {
        hashSet[key] = true;
    }
    
    public void remove(int key) {
        hashSet[key] = false;
    }
    
    public boolean contains(int key) {
        return hashSet[key];
    }
}
