import java.util.Scanner;

public class LongestConsecutiveSum {
   
   public static boolean linearsearch(int arr[] , int x ){
    boolean search = false;
    for(int i =0;i<arr.length;i++){
    if(arr[i] == x){
        return true;
    }
}
        return false;
}
    public static void Better(int arr[],int n){
        for(int i =0;i<n;i++){
            
        }   
    }
 


    public static void Brute(int arr[] , int n,int x){
        int longest = 1;
        int count =1;
        
        for(int i =0;i<n;i++){
            x = arr[i];
            count=1;

            while (linearsearch(arr, x+1) == true)  {
                x = x+1;
                count = count+1;
                
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int x=0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Brute(arr, n, x+1);
        
    }
    }


