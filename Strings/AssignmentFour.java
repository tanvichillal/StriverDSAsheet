import java.util.*;

public class AssignmentFour {

    public static boolean anagrams(String str1 , String str2){
        char[]  ch1 = str1.toCharArray();
        char[]  ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        return Arrays.equals(ch1, ch2);
        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        if( anagrams(str1, str2)){
            System.out.println("String  are anagrams");
        }
        else{
            System.out.println("They are not anagrams");
        }
        
        

    }
}
