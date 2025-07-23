import java.util.Scanner;
public class SortArray_zero_one_two {

    public static void BruteSort(int arr[],int n){
        int smallest = Integer.MAX_VALUE;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        

        for(int i =0;i<n;i++){
            if(arr[i] == 0){
                count0++;
            }
            else if (arr[i] == 1){
                count1++;
            }
            else if (arr[i] == 2){
                count2++;
            }
            
            
        }
        for(int i =0;i<count0;i++){
            arr[i] = 0;
        }
        
        for(int i =count0;i<count1 + count0;i++){
            arr[i] = 1;
        }
        for(int i =count1 + count0;i<n;i++){
            arr[i] = 2;
        }

        for(int i =0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        BruteSort(arr, n);
    }
}
