public class HashSet {
  public static voic main(String[] args) {
      Set<Integer> hashSet = new HashSet<>();
      //Add keys
      hashSet.add(1);
      hashSet.add(2);
      hashSet.add(3);
      //Search key
      if(hashSet.contains(2)) System.out.println("True");
      //Remove key
      hashSet.remove(2);
      //size of hash set
      System.out.println(hashSet.size());
      //Iterate over hash set
      for(Integer i: hashSet) System.out.println(i + " ");
      //clear hash set
      hashSet.clear();
      //check if empty
      if(hashSet.isEmpty()) System.out.println("Hash set is empty!");
  }
}
