import java.util.*;

public class MergeSortedArrays{

    public static void merge(int arr1[] , int arr2[] , int arr3[] ){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0,j=0,k=0;

        while (i<n1) {

            arr3[k++] = arr1[i++];
        }
        while(j<n2){
            arr3[k++] = arr2[j++];
        }
        Arrays.sort(arr3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2 []= new int[m];

        for(int i =0;i<n;i++){
            arr1[i] = sc.nextInt();
        }

        for(int i =0;i<m;i++){
            arr2[i] = sc.nextInt();
        }
        int arr3[] = new int [n+m];
        merge(arr1, arr2, arr3);
        for(int i =0;i<n+m;i++){
            System.out.println(arr3[i]);
        }


    }
}