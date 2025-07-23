class Node{
    int data;
    Node next;
    Node back;

    Node(int data1 , Node next1, Node back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}
public class DLL {
    public static Node ConvertDArrtoLL(int arr[] ){
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i] , null , prev);
            prev.next = temp;
            prev = temp; 
        }
        return head;
    } 

    public static void print(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head=head.next;
        }
        System.out.println();
    }

    public static Node deleteHead(Node head ){
        if(head == null) return null;
        if(head.next == null){
            return null;
        }
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;

        return head;
    }

    public static Node deleteTail(Node head){
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node prev = tail.back;
        prev.next = null;
        tail.back = null;
        return head;

    }

    public static void deleteNode(Node temp){
            Node prev = temp.back;
            Node front = temp.next;

            if(front == null){
                prev.next = null;
                temp.back = null;
                return;
            }
            prev.next= front;
            front.back = prev;

            temp.next = temp.back = null; 
    }

    public static Node beforeHead(Node head,int val){
        Node newnode = new Node(val);
    
        head.back = newnode;
        newnode.next = head;
        newnode.back = null;
        return newnode;

    }

    public static Node beforeTail(Node head, int val) {
        Node newnode = new Node(val);
    
        // Handle edge cases where the list has less than two nodes
        if (head == null || head.next == null) {
            System.out.println("List must have at least two nodes to insert before the tail.");
            return head;
        }
    
        // Traverse to the second-to-last node
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
    
        // Insert the new node before the tail
        newnode.next = temp.next;         // New node's next points to the tail
        temp.next.back = newnode;         // Tail's back points to the new node
        temp.next = newnode;              // Second-to-last node's next points to the new node
        newnode.back = temp;              // New node's back points to the second-to-last node
    
        return head; // Return the head of the list
    }
    
    public static Node kElement(Node head , int k ,int val){
        int count = 0;
        
        if(k == 1){
            return beforeHead(head, val);
        }
        Node temp = head;
        while(temp.next != null){
            count++;
            if(count == k) break;
            temp = temp.next;
        }
        Node prev = temp.back;
        Node newnode = new Node(val,temp,prev); 
        prev.next = newnode;
        temp.back = newnode;

        return head;
    }

    public static void InsertNode(Node node ,int val){
        Node prev = node.back;
        Node newnode = new Node(val,node,prev);
        prev.next = newnode;
        node.back = newnode;
    }

    public static void InsertatTail(Node head,int val){
        Node newnode = new Node(val);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.back = temp;
        newnode.next = null;

    }
    
    public static void ReverseDLL(Node head ){

    }
    public static void main(String[] args) {
        int arr[] = {8, 7, 9, 4, 5, 6};
        Node head = ConvertDArrtoLL(arr);  
        InsertatTail(head, 152  );
        print(head);                     
    }
}