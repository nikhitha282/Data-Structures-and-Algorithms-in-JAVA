//This program finds duplicates in a list using hash set.
import java.util.*;

public class FindDuplicates {
  public static void main(String[] args) {
    
    //Creating a list with duplicates
    List<Integer> list = new LinkedList<>();
    
    //adding elements 0-9 in the list
    for(int i=0; i<10; i++) list.add(i);
    
    //adding duplicates in the list
    list.add(4); list.add(9);
    
    //check if duplicates exist in the list
    if(containsDuplicates(list)) System.out.println("The list contains duplicates");
                            else System.out.println("The list does not contain duplicates");
    
  }
  
  public static boolean containsDuplicates(List<Integer> keys) {
    //create a hashset
    Set<Integer> hashSet = new HashSet<>();
    //for each element in the list, check if it exists in the hash set. If exists, return true. Else, add in hash set.
    for(Integer key : keys) {
      if(hashSet.contains(key)) return true;
      else hashSet.add(key);
    }
    //return false if list does not contain duplicates
    return false;  
  }
}
