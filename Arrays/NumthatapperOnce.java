import java.util.Scanner;

public class NumthatapperOnce {

    public static void BruteOnce(int arr[], int n ){
       
        for(int i =0;i<n;i++){
            int num = arr[i];
            int count =0;
            for(int j =0;j<n;j++){
                if(arr[j] == num){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(num);
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
        BruteOnce(arr, n);
    }
}
