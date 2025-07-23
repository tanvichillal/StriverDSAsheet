import java.util.Scanner;

public class TutSeven {
    
        public static void printBoard(int board[]){
            int  N = board.length;
            for(int i =0;i<N;i++){
                for(int j =0;j<N;j++){
                    if(board[i] == j){
                        System.out.print(" Q ");
                    }
                    else{
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }
        }
        
        public static boolean isSafe(int board[] , int row , int col){
            for(int i =0;i<row;i++){
                if(board[i] == col || Math.abs(board[i] - col) == Math.abs(i-row)){
                    return false;
                }
            }
            return true;
        }

        public static boolean solvenqueen(int board[] , int row){
            int N = board.length;
            if(row == N){
                printBoard(board);
                return true;
            }
            for(int col =0;col<N;col++){
                if(isSafe(board, row, col)){
                    board[row] = col;
                    if(solvenqueen(board, row+1)){
                        return true;
                    }
                    board[row] = -1;
                }
            }
            return false;
        }

        public static void solvenqueen(int N){
            int board[] = new int [N];
            for(int i =0;i<N;i++){
                board[i] = -1;
            }
            if(!solvenqueen(board, 0)){
                System.out.println("no soln found !!!");
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            int N = sc.nextInt();
            solvenqueen(N);
        }
}
