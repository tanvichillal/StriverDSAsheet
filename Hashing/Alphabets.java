import java.util.Scanner;

public class Alphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   //Taking input
        String s = sc.nextLine();              //String input from user

        //precompute
        int hash[] = new int[26];             // A hash array to store the number of times the ch is repeated
        for(int i =0;i<s.length();i++){       //It is a loop in which it will count the no. of times ch is repeated while traversing the String
                char ch = s.charAt(i);        //To access the ch in the string index by index
                if(ch >= 'a' && ch <= 'z'){   //To make sure that it is between lowercases only 
                    hash[ch - 'a']++;         //If the ch is found the count in the hash[] will increase
                }
        }

        int q = sc.nextInt();                 //Input from user that which how much ch they want to search
        while(q-- != 0){                      //Till the q != 0 taking the input (ch) they want to search
            char c = sc.next().charAt(0); // taking input 
            System.out.println(hash[c-'a']);    //Print the no.of times the ch is repeated
        }
        

    }
}
