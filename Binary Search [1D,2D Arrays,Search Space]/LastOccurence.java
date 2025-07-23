import java.util.Scanner;

public class LastOccurence {
    public static void last(int arr[] , int n,int key ){
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(arr[i] == key){
              
                largest = i;
                System.out.println(largest);
              }
            }
            
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        last(arr, n, 13);

    }
}
