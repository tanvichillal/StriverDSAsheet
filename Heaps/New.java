import java.util.*;

public class New {

    static class Heap{
        ArrayList<Integer>  arr= new ArrayList<>();
        public void  add(int data){                   //TC : O(logN)
            //add at last;
            arr.add(data);
            int x = arr.size() - 1;
            int par = (x-1) / 2;
            while(arr.get(x)<arr.get(par)){           //Time Complexity : O(logN)
                int temp = arr.get(x);
                arr.set(x , arr.get(par) );
                arr.set(par,temp);
                
                x = par;
                par = (x-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        public void heapify(int i ){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left < arr.size()  && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }
            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }

            if(minIdx != i){
                int temp = arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx,temp);

                heapify(minIdx);
                
            }
        }

        public int remove(){

            //swap 1 = swap first and last
            int data = arr.get(0);
            int temp = data;
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size() -1,temp);
            //2nd step : remove the last node
            arr.remove(arr.size() - 1);
            //3rd step : heapify
            if(!arr.isEmpty()){
                heapify(0);
            }
            return data;

        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }

    }
    public static void main(String[] args) {
        Heap h1 = new Heap();
        h1.add(3);
        h1.add(4);
        h1.add(1);
        h1.add(5);

        while (!h1.isEmpty()) {
            System.out.println(h1.peek() );
            h1.remove();
            
        }


    }
}
