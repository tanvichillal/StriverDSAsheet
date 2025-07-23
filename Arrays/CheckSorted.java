import java.util.Scanner;

public class CheckSorted {
    public static boolean sort(int arr[] , int n ){
        for(int i =0;i<n;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
 
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if(sort(arr, n)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
    }
}
