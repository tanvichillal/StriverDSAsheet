class Node{
    int data;
    Node next;

    Node(int data1 ,  Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class LL{

    private static Node ConvertArrtoLL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i =1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        } 
        return head;
    }
    
    public static int length(Node head ){
        int count = 0;
        Node temp = head;
        while (temp != null) {
                temp = temp.next;
                count++;
            }
        return count;    
    }

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
            int arr[] = {8,7,9,4,5,6};
            Node head = ConvertArrtoLL(arr);
            int ans = length(head);
            System.out.println(ans);
    }
}