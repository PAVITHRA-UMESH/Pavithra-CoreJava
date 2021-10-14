package Session;

public class DoublyLinkedListDemo {
	 Node head; // head of list 
	  
	    /* Doubly Linked list Node*/
	    class Node { 
	        int data; 
	        Node prev; 
	        Node next; 
	  
	        // Constructor to create a new node 
	        // next and prev is by default initialized as null 
	        Node(int d) { data = d; } 
	    } 
	  
	    // Adding a node at the front of the list 
	    public void push(int new_data) 
	    { 
	        // 1. allocate node 
	        // 2. put in the data 
	        Node new_Node = new Node(new_data); 
	  
	        // 3. Make next of new node as head and previous as NULL 
	        new_Node.next = head; 
	        new_Node.prev = null; 
	  
	        // 4. change prev of head node to new node 
	        if (head != null) 
	            head.prev = new_Node; 
	  
	        // 5. move the head to point to the new node 
	        head = new_Node; 
	    } 
	  
	    // This function prints contents of linked list starting from the given node 
	    public void printlist(Node node) 
	    { 
	        Node last = null; 
	  
	        while (node != null) { 
	            System.out.print(node.data + " "); 
	            last = node; 
	            node = node.next; 
	        } 
	  
	        System.out.println(); 
	    } 
	  
	    // Function to delete a node in a Doubly Linked List 
	    // head_ref --> pointer to head node pointer
	    // del --> data of node to be deleted
	    void deleteNode(Node head_ref, Node del) 
	    { 
	  
	        // Base case 
	        if (head == null || del == null) { 
	            return; 
	        } 
	  
	        // If node to be deleted is head node 
	        if (head == del) { 
	            head = del.next; 
	        } 
	  
	        // Change next only if node to be deleted is NOT the last node 
	        if (del.next != null) { 
	            del.next.prev = del.prev; 
	        } 
	  
	        // Change prev only if node to be deleted is NOT the first node 
	        if (del.prev != null) { 
	            del.prev.next = del.next; 
	        } 
	  
	        // Finally,free the memory occupied by del 
	        return; 
	    } 
	    void reverse()
	    {
	        Node temp = null;
	        Node current = head;
	 
	        /* swap next and prev for all nodes of
	         doubly linked list */
	        while (current != null) {
	            temp = current.prev;
	            current.prev = current.next;
	            current.next = temp;
	            current = current.prev;
	        }
	 
	        /* Before changing head, check for the cases like
	         empty list and list with only one node */
	        if (temp != null) {
	            head = temp.prev;
	        }
	    }
	    // Driver Code 
	    public static void main(String[] args) 
	    { 
	        // Start with the empty list 
	        DoublyLinkedListDemo dll = new  DoublyLinkedListDemo(); 
	  
	        // Insert 1. So linked list becomes 1->NULL 
	        dll.push(1); 
	  
	        // Insert 3. So linked list becomes 3->1->NULL 
	        dll.push(3); 
	  
	        // Insert 5. So linked list becomes 5->3->1->NULL 
	        dll.push(5); 
	  
	        // Insert 7. So linked list becomes 7->5->3->1->NULL 
	        dll.push(7); 
	  
	        System.out.print("THE CREATED DOUBLY LINKED LIST IS : "); 
	        dll.printlist(dll.head); 
	        
	        dll.reverse();
	        System.out.print("ELEMENTS FROM END : ");
	       dll.printlist(dll.head);
	        // Deleting first node 
	        dll.deleteNode(dll.head, dll.head); 
	  
	        // List after deleting first node 
	        // 3->5->1 
	        System.out.print("LIST AFTER DELETING FIRST NODE : "); 
	        dll.printlist(dll.head); 
	  
	        // Deleting middle node from 3->5->1 
	        dll.deleteNode(dll.head, dll.head.next); 
	  
	        System.out.print("LIST AFTER DELETING MIDDLE NODE : "); 
	        dll.printlist(dll.head); 
	        
	        dll.push(9);
	        System.out.print("LIST AFTER ADDING ELEMENT : ");
	        dll.printlist(dll.head);
	    } 
	} 
       

