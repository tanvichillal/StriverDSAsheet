import java.util.Scanner;

public class AssignmentOne {

    public static void AssignmentTwo(String str , String str1 , String str2){
        System.out.println(str.equals(str1) + " " + str.equals(str2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 
        String str = sc.next();
        int count = 0;
        int n = str.length();
        for(int i =0;i<n;i++){
            if(str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u'){
                count++;
            }
        }   
        System.out.println(count);
        */    
        
        AssignmentTwo("Tanvi", "College", "Tanvi");
        
    }
}

