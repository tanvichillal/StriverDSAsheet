class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
        int data = data1;
        Node next = next1;
    }

    Node(int data1){
        int data = data1;
        Node next = null;   
    }    
} 

class Queue{
    Node start ;
    Node end ;

    int size;
    void push(int x){
        Node temp = new Node(x);

        if(size == 0){
            start = end = temp;
        }
        else{
            end.next = temp;
            size++;
        }
        
    }
    
    void pop(){
        if(size ==0){
            System.out.println("No elements found");
            return;
        }
        Node temp = start;
        start = start.next;
        size--;

    }

    int top() {
        if(size ==0){
            return -1;
        }
        else{
            return start.data;
        }

    }
    int length(){
        if(size ==0){
            return -1;
        }
        else{
            return size;
        }
    }
    
}

public class QueueLL {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(8);
        q.push(5);
        q.push(6);
        q.pop();
        q.pop();
        
        System.out.println("Top element : "+q.top());
        System.out.println("Current Size : " + q.length());
        
    }
    
}
