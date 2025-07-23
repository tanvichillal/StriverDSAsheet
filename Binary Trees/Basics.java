import java.util.*;

public class Basics {
    public static void Recursive(int n ,int i ){
        if(i>n){
            return;
        }
        System.out.println(n);
        Recursive(n-1, 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Recursive(n, 1);

    }
}
