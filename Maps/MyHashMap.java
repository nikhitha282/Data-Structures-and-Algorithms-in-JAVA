//Hash Map implementation for integer data
//Constraints: 0 <= key, value <= 10^6
//In case of collision, overwrite value

class MyHashMap {
    
    private int[] hashMap;
    
    public MyHashMap() {
        hashMap = new int[1000001];
        Arrays.fill(hashMap, -1); //-1 indicates no key-value pair
    }
    
    public void put(int key, int value) {
        hashMap[key] = value; //In case of collision, overwrite value
    }
    
    public int get(int key) {
        return hashMap[key];
    }
    
    public void remove(int key) {
        hashMap[key] = -1;
    }
}
