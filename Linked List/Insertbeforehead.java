class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Insertbeforehead {
    
    private static Node ConvertArrtoLL(int[] arr) {
        if (arr.length == 0) return null; 
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    //Display 

    public static void Print(Node head) {
        while (head != null) {
            System.out.print(head.data + " "); 
            head = head.next;
        }
        System.out.println(); }

    //Deletion

    public static Node deleteHead(Node head) {
        if (head == null) return null; 
        return head.next;  
    }
    

    public static Node deleteTail(Node head){
        Node temp = head;
        if(head == null)return head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    
    public static Node deleteElement(Node head , int el ){
  
        if(head == null) return head;
            if(head.data == el){
                head = head.next;
                return head;
            }
            
            Node temp = head;
            Node prev = null;
            while(temp != null){
               
                if(temp.data == el){
                    prev.next = prev.next.next;
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
            return head;
        }

    //Insertion
    public static Node insertHead(Node head , int val){
        Node temp = new Node(val , head);
        return temp;
    }

    public static Node insertTail(Node head , int val){
        
        if(head == null) return new Node(val);
        Node temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }
        Node newnode = new Node(val);
        temp.next = newnode;
        return head;
    }


    public static Node insertPosition(Node head,int el,int k ){
        if(head == null){
            if(k ==1){
                return new Node(el);
            }
            else{
                return head;
            }

        }
        if(k ==1){
            Node newhead = new Node(el,head);
            return newhead;
        }
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            if(count == (k-1)){
                Node newnode = new Node(el , temp.next);
                temp.next = newnode;
                break;

            }
            temp = temp.next;

        }
        return head;
    }
    
    public static Node insertByValue(Node head,int el,int val ){
        if(head == null){
            return null;
        }
        if(head.data == val){
            Node newhead = new Node(el,head);
            return newhead;
        }
        Node temp = head;
        while(temp.next != null){
            
            if(temp.next.data == val){
                Node newnode = new Node(el , temp.next);
                temp.next = newnode;
                break;

            }
            temp = temp.next;

        }
        return head;
    }
    //Search wheather an element is present 
    public static int checkifpresent(Node head , int val){
        Node temp = head;
        
        while (temp != null) {
            if(temp.data == val){
                return 1 ;
            }
            temp = temp.next;  
        }
        return 0;
}

public static void main(String[] args) {
    int[] arr = {8, 7, 9, 5, 6, 4};

    // Convert array to linked list
    System.out.println("Converting array to linked list:");
    Node head = ConvertArrtoLL(arr);
    Print(head);

    // Insert at head
    System.out.println("Inserting 10 at head:");
    head = insertHead(head, 10);
    Print(head);

    // Insert at tail
    System.out.println("Inserting 20 at tail:");
    head = insertTail(head, 20);
    Print(head);

    // Insert at position
    System.out.println("Inserting 15 at position 3:");
    head = insertPosition(head, 15, 3);
    Print(head);

    // Insert by value
    System.out.println("Inserting 100 before value 9:");
    head = insertByValue(head, 100, 9);
    Print(head);

    // Delete head
    System.out.println("Deleting head:");
    head = deleteHead(head);
    Print(head);

    // Delete tail
    System.out.println("Deleting tail:");
    head = deleteTail(head);
    Print(head);

    // Delete specific element
    System.out.println("Deleting element 5:");
    head = deleteElement(head, 5);
    Print(head);

    // Search for an element
    System.out.println("Checking if 5 is present:");
    int result = checkifpresent(head, 5);
    if (result == 1) {
        System.out.println("Element 5 is present in the linked list.");
    } else {
        System.out.println("Element 5 is not present in the linked list.");
    }
}}
