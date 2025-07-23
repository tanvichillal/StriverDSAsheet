
    import java.util.Scanner;

public class KadanesAlgm {

    public static void algm(int arr[] , int n ){
        int cs=0;
        int max = arr[0];
        for(int i =0;i<n;i++){
            cs = cs+arr[i];
            max = Math.max(cs, max);
            if(cs < 0){
                cs =0;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        algm(arr, n);

    }
}

