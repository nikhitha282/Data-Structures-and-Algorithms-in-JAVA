/*
Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

Do not modify the linked list.
*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 
public class DetectCycle2 {
    public ListNode detectCycle(ListNode head) {
        
        if(head == null) return null;
        
        Map<ListNode, Integer> visited = new HashMap<>();
        
        ListNode temp = head; int i = 0;
        
        while(temp!=null)
            if(!visited.containsKey(temp)) {
                visited.put(temp, i); 
                temp = temp.next;
                i++;
            }
            else return temp;
        
        return null;
    }
}
