import java.util.Scanner;
 
public class Basics {

    public static void printletter(String str){
        for(int i =str.length() - 1;i >= 0;i--){
            System.out.print(str.charAt(i) +"  ");
        }
    }

    public static void printletter(String str){
        for(int i =str.length() - 1;i >= 0;i--){
            System.out.print(str.charAt(i) +"  ");
        }
    }


    public static void main(String[] args) {
        char arr[] = {'a' , 'b' , 'c' , 'd'};
        String str = "Tanvi";
        String str2 = new String("hello world");
        Scanner sc = new Scanner(System.in);
        System.out.println(str +" "+ str2);
        printletter(str2);
    }
} 
