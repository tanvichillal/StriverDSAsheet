import java.util.*;

public class Basics{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int hash[] = new int[1000000000];
        for(int i =0;i<n;i++){
            hash[arr[i]] += 1;

        }
        int numcheck ;
        numcheck= sc.nextInt();
        while(numcheck-- != 0){
            int num = sc.nextInt();
            System.out.print(hash[num] + " ");
        } 

    }
}