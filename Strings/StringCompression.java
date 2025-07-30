import java.util.Scanner;

public class StringCompression {

    public static String scompress(String str){
        StringBuilder sb = new StringBuilder();
        String newstr = "";
        int n = str.length();
        for(int i =0;i<n;i++){
            Integer count = 1;
            while(i < n-1 && str.charAt(i) == str.charAt(i+1)){
                count ++;
                i ++;
            }
            newstr = newstr + str.charAt(i);
            if (count > 1){
                newstr += count.toString();
            }
        }
        return newstr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "aaabbcccddd";
        System.out.println(scompress(str));
    }
}
