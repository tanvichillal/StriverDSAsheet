class Queue{
    int start = -1;
    int end  = -1;
    int currsize = 0;
    int size = 4;
    int arr[] = new int [size];
   
    void push(int x){
        if(currsize == size){
            System.out.println("Full");
            return;
        }
        if(currsize == 0){
            start = 0;
            end = 0;
        }
        else{
        end = (end+1)%size;
        }
        arr[end] = x;
        currsize ++;
    }
   
    void pop(){
        if(currsize == 0){
            System.out.println(-1);
            return;
        }
        else{
            start = (start + 1)%size;
            currsize--;
        }
    }
   
    int top(){
        if(currsize == 0 ){
            return -1;
        }
        else{
            return arr[start];
        }
    }
    int length(){
        if(currsize == 0){
            return -1;
        }
        else{
            return currsize;
        }
    }
   
}
public class QueueArr {
    public static void main (String args[]){
        Queue q = new Queue();
        q.push(8);
        q.push(5);
        q.push(6);
        q.push(7);
        q.pop();
       
       
        System.out.println("Top of the queue: " + q.top());
        System.out.println("Current size of the queue: " + q.length());
       
    }
}