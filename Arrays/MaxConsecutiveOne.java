import java.util.Scanner;

public class MaxConsecutiveOne {

    public static int maxone(int arr[],int n){
        int count =0;
        int max =0;
        for(int i =0;i<n;i++){
           if(arr[i] == 1){
            count++;
            max = Math.max(max, count);
           }
           else{
            count = 0;
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
        int ans = maxone(arr, n);
        System.out.println(ans);
 }   
}
