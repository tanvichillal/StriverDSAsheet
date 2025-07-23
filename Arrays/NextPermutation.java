import java.util.*;

public class NextPermutation {
    public static void Permutation(int arr[]  , int n ){
        int index = -1;
        for(int i =n-2;i>=0;i--){
            if(arr[i] < arr[i+1]){
                index = i;
                break;
            }
        }

        if (index != -1) {
            for(int i = n - 1; i > index; i--){
        
            if(arr[i] > arr[index]){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }}
        Arrays.sort(arr , index+1,n);

        for(int i =0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Permutation(arr, n);

    }
}
