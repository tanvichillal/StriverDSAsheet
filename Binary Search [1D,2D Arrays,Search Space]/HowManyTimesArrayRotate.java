import java.util.Scanner;

public class HowManyTimesArrayRotate {
    public static int Brute(int arr[] , int n){
        
        int small = Integer.MAX_VALUE;
        int index = -1;

        for(int i =0;i<n;i++){
            if(small > arr[i]){
                small = arr[i];
                index = i;
                
            }
        }
        return index;
        
    }
    public static int Minimum(int arr[] , int n){
        int low =0;
        int ans =Integer.MAX_VALUE;
        int high = n-1;
        while (low<=high) {
            int mid = (low + high)/2;

            if(arr[low] <= arr[high]){
                if(arr[low] < ans){
                    ans = arr[low];
                }
                break;
            }


            if(arr[mid] >= arr[low]){
                if(arr[low] < ans){
                    ans = arr[low];
                }
                low = mid+1;
                
            }
            else{     
                high = mid -1; 
                if(arr[mid] < ans){
                    ans = arr[mid];
                }
                
               
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
        int ans = Minimum(arr, n);
        System.out.println(ans);
    }
}
