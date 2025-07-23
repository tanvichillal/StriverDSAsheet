import java.util.Scanner;

public class FloorAndCeil {
  //  floor = largest no in array <= x  (smallest apply)
    // ceil = smallest no in array >= x  (largest apply)

    public static int bound(int arr[] , int n,int x ){

        int low =0;
        int ans = n;
        int high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if (arr[mid] <= mid) {
                ans = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            
        }
        return ans;
    }

    public static int lowerbound(int arr[],int n,int x){
        int low = 0;
        int high = n-1;
        int ans =n;

        while(low <= high){
            int mid = (low + high)/2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
                low = mid + 1; // Incorrectly incrementing `low`
            }
            
            else{
                high = mid-1;
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
        bound(arr, n, 25);
        lowerbound(arr, n, 25);

        
    }
}
