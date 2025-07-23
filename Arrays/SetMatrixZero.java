import java.util.Scanner;

public class SetMatrixZero {
    public static void Bettersetzero(int arr[][] , int n  , int m){
        int row []= new int [n];
        int col[] = new int [m];

        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(arr[i][j] == 0 ){
                    row[i] = 1;
                    col[i] = 1;
                }
            }
        }

        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(row[i] == 1 || col[j] == 1){
                    arr[i][j] = 0;
                }
            }
        }

    }

    

    public static void Brutesetzero(int arr[][] , int n  , int m){
        int row[] = new int [n];
        int col[] = new int [m];
        
        for(int i = 0;i<n;i++){ 
            for(int j =0;j<m;j++){
                if(arr[i][j] == 0){
                    row[i] = -1;
                    col[j] = -1;
                }
            }
        }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(row [i] == -1 || col[j] == -1){
                    arr[i][j] = 0;
                }
                
            }
        }
        System.out.println("");
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                System.out.print(arr[i][j]  + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        
        int arr[][] = new int [n][m];

        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                arr[i][j] = sc.nextInt();
            
        }
        
    }
    
    setzero(arr, n, m);
    }
}
