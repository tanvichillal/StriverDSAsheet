import java.util.Scanner;

public class RowwithMaxNoone {

    public static void Num(int arr[][] , int n,int m){
        int count = 0;
        int maxcount = Integer.MIN_VALUE;
        int index = -1;
        for(int i =0;i<n;i++){
            count = 0;
            for(int j =0;j<m;j++){
                count = count + arr[i][j];
            }
            if(count > maxcount){
                maxcount = count;
                
                index = i;
                
            }
        } 
        System.out.println(index);
    }


    public static int Optimal(int arr[] , int n,int key){
        int high = n-1;
        int low = 0;
        
        int ans = n;

        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] >= key){
                ans = mid;
                high=  mid-1;
                low = mid+1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
        }
    }
    
}
}
