import java.util.*;
public class Mapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[] = new int [n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        HashMap <Integer , Integer> mpp = new HashMap<>();
        for(int i =0;i<n;i++){
            int key = arr[i];
            int freq = 0;
            if(mpp.containsKey(key))  freq = mpp.get(key);
            freq++;
            mpp.put(key, freq);
        }

        int q = sc.nextInt();
        while(q-- != 0){
            int num = sc.nextInt();
            if(mpp.containsKey(num)){
                System.out.println(mpp.get(num));
            }
            else{
                System.out.println(0);
            }
                        }

    }
}
