public class rotateString {
    
}
class Solution {
    public boolean rotateString(String s, String g) {

        
        int m = g.length();
        StringBuilder sb = new StringBuilder(s);
        int n = s.length();
  
        while(n -- > 0){
            char ch = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(ch);

            if(sb.toString().equals(g)){
                return true;
            }
        }
        return false;
    }
}