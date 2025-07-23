import java.util.Scanner;

public class NthRootofNum {
    public static void Brute(int n ,int m){
        for(int i =0;i<n;i++){
            System.out.print(i*n);
        }

    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Brute(n, 7);
        
    }
}

