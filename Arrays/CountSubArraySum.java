import java.util.Scanner;

public class CountSubArraySum {

    public static void subarraysum(int arr[] ,int target){
        int n = arr.length;
        for(int i =0;i<n;i++){
            int sum = 0;
            for(int j =i;j<n;j++){
                sum += arr[j];
                if(sum == target){
                    System.out.print("[" + arr[i] + "," + arr[j] + "]");
       
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        int arr[] = new int [n];
        
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        subarraysum(arr, target);
        
    }
}
