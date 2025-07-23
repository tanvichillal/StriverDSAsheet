import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        // Create array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Display array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        // Search an element
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("The element is present at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The element is not present");
        }
    }
}
