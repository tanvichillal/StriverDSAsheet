import java.util.Scanner;

public class SquareRoot {
    
    public static int Bruteroot(int n){
        int ans = 1;
        for(int i =0;i<n;i++){
            if(i*i <= n){
                ans  = i;
            }
            else{
                break;
            }
        }
        return ans;
    }
    public static int Optimal(int n){
        int low = 1;
        int high = n;
        int ans = 1;
        while (low <= high){
            int mid = (low + high)/2;
            if(mid * mid <= n){
                ans = mid;
                low = mid + 1;;
            }
            else{
                high = mid -1;

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int result = Optimal(n);
        System.out.println(result);
        
    }
}
