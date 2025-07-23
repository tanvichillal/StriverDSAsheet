import java.util.Scanner;

class LargestElement{

    public static int largest (int arr[] , int n ){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(max < arr[i]){
                max = arr[i]; 
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = largest(arr, n);
        System.out.println(ans);
    }
}