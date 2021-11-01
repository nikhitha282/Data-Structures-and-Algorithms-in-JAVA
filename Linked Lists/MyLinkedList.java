/*
Design your implementation of the linked list. You can choose to use a singly or doubly linked list.
A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and next is a pointer/reference to the next node.
If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.

Implement the MyLinkedList class:

MyLinkedList() Initializes the MyLinkedList object.
int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.
void addAtHead(int val) Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
void addAtTail(int val) Append a node of value val as the last element of the linked list.
void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list. If index equals the length of the linked list, the node will be appended to the end of the linked list. If index is greater than the length, the node will not be inserted.
void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid.
*/

class MyLinkedList {
    
    Node head;
        
    class Node {
        int val;
        Node next;
        
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    

    public MyLinkedList() {
    	head = null;
    }
    
    
    public int get(int index) {
    	if(head == null || index < 0) return -1;
    	
    	Node temp = head;
    	int i = 0;
    	
    	while(i++ != index && temp != null)   temp = temp.next;
        
    	if(temp != null) return temp.val;
        else return -1;
    }
    
    
    public void addAtHead(int val) {
        Node new_node = new Node(val);
        new_node.next = head;
        head = new_node;      
    }
    
    
    public void addAtTail(int val) {
        
        Node new_node = new Node(val);
        
        if(head == null) {
            head = new_node;
            return;
        }
        
        Node temp = head;
        
        while(temp.next!=null)  temp = temp.next;
        
        temp.next = new_node;
    }
    
    
    public void addAtIndex(int index, int val) {
    	    	
    	Node new_node = new Node(val);
        
    	Node temp = head;
    	int i = 0;
        
        if(index == 0) {
            addAtHead(val);
            return;
        }
        
        while(i++ < index-1 && temp != null) temp = temp.next;
        
    	if(temp != null && index > 0) {
            new_node.next = temp.next;
            temp.next = new_node;
        }
    	
    }
    
    public void deleteAtIndex(int index) {
    	
    	if(head == null || index < 0) return;
        
        if(index == 0) {
            head = head.next;
            return;
        }
        
        int i = 0;
        Node temp = head;
        
        while(i++ < index-1 && temp.next != null)   temp = temp.next;
        
        if(temp.next != null) temp.next = temp.next.next;
  
    }
}
