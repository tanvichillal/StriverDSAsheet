class Node {
    int data;
    Node next;
    Node(int data1 , Node next1){
        int data = data1;
        Node next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}
class Stack{
    Node top;
    int size;

    void push(int x){
        Node temp = top;
        temp.next = top;
        top = temp;
        size ++;;
    }
    void pop(){
        if(size ==0){
            System.out.println("No elements found");
            return;
        }
        else{
            Node temp = top;
            top = temp.next;
            size--;
        }
    }
    int peek(){
        return top.data;
    }
    int length(){
        return size;
    }

}

public class StackLL {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(8);
        s.push(7);
        s.push(6);
        s.pop();

        System.out.println("Top element : "+s.peek());
        System.out.println("Current size : "+s.length());   
    }   
}
