import java.util.Scanner;

public class TutEightB{

    public static void branchnbound(int index , int currentweight , int currentprofit){
        if(currentweight > capacity) {
            return;
        }
        if(index == n){
            if(currentprofit > maxprofit){
                maxprofit = currentprofit;
            }
            return; 
        }

        // Include the current item
        branchnbound(index + 1, currentweight + weights[index], currentprofit + profits[index]);

        // Exclude the current item
        branchnbound(index + 1, currentweight, currentprofit);
    }

    static int maxprofit = 0;
    static int weights[];
    static int profits[];
    static int n , capacity;

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of items");
        n = sc.nextInt();
        weights = new int[n];
        profits = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter weight and profit of item " + (i + 1) + ": ");
            weights[i] = sc.nextInt();
            profits[i] = sc.nextInt();
        }

        System.out.println("Enter Capacity of Knapsack:");
        capacity = sc.nextInt();

        branchnbound(0, 0, 0);

        System.out.println("Maximum Profit: " + maxprofit);
    }
}
