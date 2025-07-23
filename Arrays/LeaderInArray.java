import java.util.Scanner;

public class LeaderInArray {
    public static void next(int arr[] , int n){
        boolean leader  = true;
        for(int i =0;i<n;i++){
            leader = true;

            for(int j =i+1;j<n;j++){
                if(arr[i] < arr[j]){
                    leader = false;
                    break;
                }
            }
            if(leader == true){
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void before(int arr[], int n) {
        int max = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (i != n - 1) { // Skip printing for the last element
                System.out.println(max);
            }
            // Update max with the current element
            max = Math.max(max, arr[i]);
        }
        System.out.println(-1); // Print -1 for the last element
    }
    
   
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        before(arr, n);
    }
}
