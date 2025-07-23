import java.util.Scanner;

public class CountSubarrySum {

    public static void subarray(int arr [] , int n , int k ){
        int sum =arr[0];
        for(int i =0;i<n;i++){
            sum = sum + arr[i];
            if(sum == k ){
                System.out.println(i);
            }

        }
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        subarray(arr, n , 6);
        
    }
}
