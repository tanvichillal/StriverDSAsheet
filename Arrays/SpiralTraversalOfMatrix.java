import java.util.*;

public class SpiralTraversalOfMatrix {

    public static List<Integer> printSpiral(int arr[][]) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int m = arr[0].length;
        int right = m - 1, left = 0, top = 0, bottom = n - 1;

        while (top <= bottom && left <= right) {

            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                ans.add(arr[top][i]);
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(arr[i][right]);
            }
            right--;

            // Traverse from right to left (only if top <= bottom)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }

            // Traverse from bottom to top (only if left <= right)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(arr[i][left]);
                }
                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        
        // Read matrix input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Get the spiral traversal
        List<Integer> result = printSpiral(arr);
        System.out.println(result);
    }
}
