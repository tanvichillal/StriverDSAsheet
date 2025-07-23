class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}
public class LengthLL {

    public static Node ConvertArrtoLL(int arr[] ){
        Node head = new Node(arr[0]);
        Node mover =head;
        for(int i =0;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static int Length(Node head ){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count ++;
        }
        return count;
    }

    

    public static void main(String[] args) {
        int arr[] = {7,8,9,4,5,6};
        Node head = ConvertArrtoLL(arr);
        int ans = Length(head);
        System.out.println(ans);

    }
}
