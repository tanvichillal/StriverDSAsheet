import java.util.Scanner;

public class ImplementLowerBound {

    public static void LowerBound(int arr[] ,int n , int key){
        
        int high= n-1;
        int low = 0;
        int mid = (low + high)/2;
        int smallest = Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            if(arr[i] >= key){
                if(smallest > arr[i]){
                    smallest =arr[i];
                System.out.println(i);
                }
            }
        }
    }

    public static int Optimal(int arr[] , int n,int key){
        int high = n-1;
        int low = 0;
        
        int ans = n;

        while(low <= high){
            int mid = (low + high)/2;
            
            if(arr[mid] >= key){
                ans = mid;
                high=  mid-1;
                low = mid+1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int result = Optimal(arr, n, 9);
        System.out.println(result);
    }
}
