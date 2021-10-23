//Hash map implementation using collections
import java.util.*;

public class HashMap {
  public static void main(String[] args) {
    Map<Integer, Integer> hashmap = new HashMap<>();
    hashmap.put(1,1);
    hashmap.put(2,4);
    hashmap.put(3,9);
    System.out.println(hashmap.get(2)); //Returns value 4
    hashmap.remove(2); //deletes key-value pair (2,4)
    //check if hashmap contains a key
    if(hashmap.containsKey(2))
      System.out.println("Key 2 is present");
    //size of hashmap
     System.out.println(hashmap.size());
    //iterate a hashmap
    for(Map.Entry<Integer, Integer> entry : hashmap.entrySet())
      System.out.println(entry.getKey() + " " + entry.getValue());
    //clear hashmap
    hashmap.clear();
    //check if hashmap is empty
    if(hashmap.isEmpty())
      System.out.println("Hashmap is empty");
  }
}
