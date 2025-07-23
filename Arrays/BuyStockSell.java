import java.util.Scanner;

public class BuyStockSell {
    public static int Stock(int arr[] ,int n ){
        int mini = arr[0];
        int maxprofit = 0;
        for(int i =0;i<n;i++){
            int cost = arr[i] - mini;
                maxprofit = Math.max(maxprofit, cost);
                mini = Math.min(mini, arr[i]);
        }
        return maxprofit;

    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Stock(arr, n);
        int ans = Stock(arr, n);
        System.out.println(ans);
    }
}
