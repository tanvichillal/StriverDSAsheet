import java.util.Scanner;

public class FindKthMissingNo {
    public static void missingno(int arr[] , int n){

        int missingnum=0;
        for(int i =0;i<n;i++){
            for(int j=0;j<100;j++){
                if(arr[i] != arr[j]){
                  System.out.println(arr[i]);
                }
            }

        }
    }
    public static int num(int arr[] , int n,int k ){

        for(int i =0;i<n;i++){
            if(arr[i] <= k){
                k++;
            }
            else{
                break;
            }

        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = num(arr, n, 5);
        System.out.println(ans);
    }
}
