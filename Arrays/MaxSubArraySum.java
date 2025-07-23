import java.util.Scanner;

public class MaxSubArraySum {

    public static void Array(int arr[] , int n){
        int max = Integer.MIN_VALUE;
        int sum =0;
        for(int i =0;i<n;i++){
            sum =0;
            for(int j = i;j<n;j++){
                sum = sum + arr[j];
                max = Math.max(max,sum);
                
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Array(arr, n);
    }
}
