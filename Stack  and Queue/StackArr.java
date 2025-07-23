class Stack {
    int top = -1;
    int size = 1000;
    int arr[] = new int[size];

    
    void push(int x) {
        if (top >= size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top] = x;
    }

    
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            top--;
        }
    }

    
    int peek() {
        if (top == -1) {
            return -1;
        } else {
            return arr[top];
        }
    }

    
    int length() {
        return top + 1;
    }
}
public class StackArr{                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
    public static void main(String args[]) {
        Stack s = new Stack();

        
        s.push(8);
        s.push(4);
        s.push(7);
        s.pop();

        System.out.println("Top element: " + s.peek());
        System.out.println("Current size: " + s.length());
    }
}
