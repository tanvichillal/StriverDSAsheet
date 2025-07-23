import java.util.Scanner;

public class RearrangeElementbySign {
    public static void BruteSign(int arr[] ,int n ){

        int positive[] = new int[n];
        int negative[] = new int[n];
        int posindex = 0;
        int negindex = 0;
        
        
        for(int i =0;i<n;i++){
          if(arr[i] > 0){
            positive[posindex ++ ] = arr[i];

          }
          else if (arr[i] < 0){
            negative[negindex ++ ] = arr[i];
             }
        }

        for(int i=0;i<n/2;i++){
            arr[2*i] = positive[i];
            arr[2*i + 1] = negative[i];
        }


        for (int i = 0; i < n / 2; i++) {
            System.out.print(positive[i] + " "); 
            System.out.print(negative[i] + " "); 
        }
        
        
        
    }

    public static void OptimalSign(int arr[] , int n ){
        int positive[] = new int [n];
        int negative[] = new int [n];
        int positiveindex  = 0;
        int negativeindex  = 1;
        
        for(int i=0;i<n;i++){
            if(arr[i] > 0){
                positive[positiveindex] = arr[i];
                positiveindex +=2;

            }
            else if (arr[i] < 0){
                negative[negativeindex] = arr[i];
                negativeindex += 2;
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
        BruteSign(arr, n);
        
    }
}
