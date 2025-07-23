class Node{
    int data;
    Node next;

    Node(int data1 , Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}




public class LLRevise {
    public static int lengthofLL(Node head){
        int count  = 0;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static Node search(Node head , int key){
        Node temp = head;
        while(temp.data != key ){
            temp = temp.next;
        }
        
        return temp;
    }

    

    public static Node convertArrtoLL(int arr[]){
    int n = arr.length;
    Node head = new Node(arr[0]);
    Node mover = head;
    for(int i =1;i<n;i++){
        Node temp = new Node(arr[i]);
        mover.next = temp;
        mover = temp;
    }
    return head;
}
    public static void main(String[] args) {
        int arr[] = {1,54,8,5,6};
        Node head = convertArrtoLL(arr);
        int ans = lengthofLL(head);
        System.out.println(ans);

    }
}
