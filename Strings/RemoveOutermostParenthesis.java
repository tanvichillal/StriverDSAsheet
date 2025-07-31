import java.util.Scanner;

public class RemoveOutermostParenthesis {
    
    public static String  outermmost(String str){
        int n = str.length();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<n;i++){
            if(str.charAt(i) == ')'){
                count--;
            }
            if(count != 0){
                sb.append(str.charAt(i));
            }
            if(str.charAt(i) == '('){
                count++;
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(outermmost(str));

        
    }
}


/*We have created a counter called as counter to keep the record 
 if we get ) then count--;
 else count++;
   but if we 
   but we will never consider the first bracket '(' bcz it is the first one and it will be the outermost as well so we have to remove it 
   thats why we will not consider it 
   and there might be a que that why we r asking the ')' first bcz if we ask '('  this then the counter will be 1 and the 1!= 0 then there will be no closing bracket for it 
   thats why asking ')' first is necessary ,  
   if(the counter != 0) then add that to the str 
*/