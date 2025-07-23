import java.util.Scanner;

public class SingleElementinSortedArr {

    public static int sort(int arr[] , int n){
        int low = 1;
        int high = n-2;
        if(n==1){
            return arr[0];
            
        }
        if(arr[0] != arr[1]){
            return arr[0];
           
        }
        if(arr[n-2] != arr[n-1]){
            return arr[n-1];
           
        }
        while(low <= high){
            int mid = (low + high)/2;
        
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
            System.out.println(arr[mid]);  
            }
            //left part eliminate
            if((arr[mid] % 2 ==0 && arr[mid] == arr[mid-1]) && (arr[mid] %2 ==0 && arr[mid] == arr[mid+1])){
                low = mid +1;
            }
            else{
                high = mid -1;
            }


        }
        return -1;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sort(arr, n);
    }
    
}
