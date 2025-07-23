import java.util.Scanner;

public class FindMissingNum {

    public static void missnum(int arr[] , int n){
        
        boolean flag = true;
        for(int i =1;i<=n;i++){
            
            flag = false;
            for(int j=0;j<=n-1;j++){
                if(arr[j] == i){
                    flag = true;
                    break;  
                }
            }
            if(!flag){
                System.out.println(i);

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
        missnum(arr, n);
        
 }   
}
