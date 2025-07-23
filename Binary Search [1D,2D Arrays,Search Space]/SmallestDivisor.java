import java.util.Scanner;

public class SmallestDivisor {

    public static int sumbyd(int[] arr, int div) {
        int n = arr.length; //size of array
        //Find the summation of division values:
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double)(arr[i]) / (double)(div));
        }
        return sum;
    }

    public static int divisor(int arr[], int limit){
        int low =1;
       
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i =0;i<n;i++){
            max = Math.max(max, arr[i]);
        }
        int high = max;

        while(low <= high){
            int mid = (low + high )/2;
            if(sumbyd(arr , mid) <= limit){
                high = mid -1;
            }
            else{
                low = mid +1;

            }
        }
        return low;

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;
        int ans = divisor(arr, limit);
        System.out.println("The minimum divisor is: " + ans);
    }
}
