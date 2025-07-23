import java.util.Scanner;

public class RemoveDuplicates {
    public static int duplicates(int arr[] , int n ){
        int i =0;
            for(int j =1;j<n;j++){
                if(arr[i] != arr[j]){
                    arr[i+1] = arr[j];
                    i++;
                }
            }
            return i+1;
        
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = duplicates(arr, n);
        for(int i =0;i<ans;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
