import java.util.Scanner;

public class MoveZeroToEnd {
    public static void Brutemovezero(int arr[] , int n  ){
        int count = 0;
        for(int i =0;i<n;i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }
        
        for(int i = count;i<n;i++){
            arr[i] =0;
        }
    }

    public static void Optimalmovezero(int arr[],int n ){
        int j =0;
        for(int i =0;i<n;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
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
        Brutemovezero(arr, n);
        Optimalmovezero(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
