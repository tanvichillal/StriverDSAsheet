import java.util.Scanner;

public class SecondLargestEle {

    public static int secondlarg(int arr[] , int n ){
        int larg = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        
        for(int i =0;i<n;i++){
            if(larg < arr[i]){
                second = larg;
                larg = arr[i];
            }
            if(arr[i] !=  larg && arr[i] > second){
                second = arr[i];
            }
          
        }
        return second;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = secondlarg(arr, n);
        System.out.println(ans);
    }
}
