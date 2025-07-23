import java.util.*;

public class MaxProductSubarray {

    public static int BruteMaxproduct(int arr [], int n){
        
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            int product = 1;
            for(int j = i;j<n;j++){
                product = product * arr[j];
                largest = Math.max(largest, product);
            }
        }
        return largest;
    }

    public static void Better MaxProducct(int arr[] , int n ){
        
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = BruteMaxproduct(arr , n);
        System.out.println(ans);

    }
}
