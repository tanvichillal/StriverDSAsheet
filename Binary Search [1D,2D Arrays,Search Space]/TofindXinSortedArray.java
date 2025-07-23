import java.util.Scanner;

public class TofindXinSortedArray{

    public static void binary (int arr[],int n  , int key){
        int high = n-1 ;
        int low = 0;    
        int mid = (low + high) /2;
       while(low <= high){
        if(key == arr[mid]){
            System.out.println(mid);
            break;
        }
        else if(key < arr[mid]){

            high = mid-1;
            for(int i =0;i<n;i++){
                if(arr[i] >= key){
                    System.out.println(key);
                }
            }
            
        }
        else if (key > arr[mid]){
            low = mid + 1;
            for(int i =0;i<n;i++){
                if(arr[i] >= key){
                    System.out.println(key);
                }
            }
        }
        
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        binary(arr, n, 5);
    }
}