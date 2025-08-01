import java.util.Scanner;

public class LargestOddnumInStr {

    public static String largestnum(String str){
        int e = str.length() -1;
        for(int i = e ;i>=0;i++){
            if((str.charAt(i) -'0') % 2  != 0){
                return str.substring(0 , i+1);
            }
        }
        return "";
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(largestnum(str));
    
    }
}



/*
LeetCode 1903 
Brute : 



Optimize : 
We can move from back and check with each integer if they are odd or even if they are odd then 
we will return the substring of that string from the start to the int where it is present (i+1);
else lreturn the "" empty string.
*/