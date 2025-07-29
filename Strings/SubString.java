import java.util.Scanner;

public class SubString {

    public static String substr(String str , int startidx , int endidx){
        String substr = "";
        for(int i =startidx;i<endidx;i++){
            substr = substr + str.charAt(i);
        }
        return substr;

    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.substring(0, 5));
        
     }
}