import java.util.Scanner;

public class ShortestPath {

    public static double path(String str){
        int n = str.length();
        int x = 0 , y =0;
        for(int i =0;i<n;i++){
            char dir = str.charAt(i);
            if(dir == 'S'){
                y--;
            }
            else if(dir== 'N'){
                y++;
            }
            if(dir == 'W'){
                x--;
            }
            else if(dir == 'E'){
                x++;
            }

        }
        int X2 = (x*x );
        int Y2 = (y*y);
        return Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         String str = "WNEENESENN";
         double ans = path(str);
         System.out.println(ans);
    }
    

}
