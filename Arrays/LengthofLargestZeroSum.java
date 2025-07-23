import java.util.Scanner;

public class LengthofLargestZeroSum {

    public static int zerosum(int arr[] , int n){
        int sum = 0;
        for(int i =0;i<n;i++){
              sum = 0;
            for(int j =i;j<n;j++){
                sum = sum + arr[i];
                if(sum == 0){
                    System.out.println(0);
                }
            }

        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = zerosum(arr, n);
        System.out.println(ans);
        
    }
}
