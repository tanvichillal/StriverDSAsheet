import java.util.Scanner;

public class Occurences {
    public static void counts(int arr[] , int n ,int key){
        int small = Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            if(arr[i] == key){
                if(small > arr[i]){
                    small = arr[i];
                    System.out.println(i);
                }
            }
        }
    }

    public static void lastoccur(int arr[] , int n ,int key){
        int larg = Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            if(arr[i] == key){
                if(larg < arr[i]){
                    larg = arr[i];
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        lastoccur(arr, n, 13);
    }
}
