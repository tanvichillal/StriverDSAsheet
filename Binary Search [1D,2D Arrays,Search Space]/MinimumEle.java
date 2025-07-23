import java.util.Scanner;

public class MinimumEle {
    public static void Bruteele(int arr[],int n){
        int small = Integer.MAX_VALUE;

        for(int i =0;i<n;i++){
            if(small > arr[i]){
                small = arr[i];
                System.out.println(arr[i]);
            }
        }
    }

    public static int Minimum(int arr[] , int n){
        int low =0;
        int ans =Integer.MAX_VALUE;
        int high = n-1;
        while (low<=high) {
            int mid = (low + high)/2;
            if(arr[mid] >= arr[low]){
                ans = Math.min(ans, arr[low]);
                low = low+1;
                
            }
            else{     
                ans = Math.min(ans, arr[low]);
                high = mid -1; 
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
        Bruteele(arr, n);

    }
}
