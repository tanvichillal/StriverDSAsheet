import java.util.Scanner;

public class FirstLetterUppercase {

    public static String toupper(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
         for(int i =1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length() ){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));  
            }
         }
         return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println(toupper(" i am tanvi"));


    }
}
