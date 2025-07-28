import java.util.Scanner;

public class StringPalindrome {

    public static boolean palindrome(String str){
        int n = str.length();


        for(int i =0;i<n/2;i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
        }
        }
        return true;
    }

    public static boolean palin(String str){
        int n =str.length();
        String str2 = str.toLowerCase();
        StringBuilder result = new StringBuilder();

        for (String st2 : strings) {
            result.append(str);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pal = sc.nextLine();
        System.out.println(palindrome(pal));
    }
}
