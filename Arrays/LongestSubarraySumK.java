import java.util.Scanner;

public class LongestSubarraySumK {

    public static void Sum(int arr[] , int n ,int k){
        int sum =0;
        for(int i =0;i<n;i++){
            for(int j =i;j<n;j++){
                for( k =i;k<j;k++){
                    sum = sum + arr[i];
                }
                
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Sum(arr, n, 10);
    }
}
