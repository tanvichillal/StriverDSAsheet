import java.util.HashSet;

public class Hash {
 public static void main(String[] args) {
    HashSet <Integer> set = new HashSet<>();
   
    int arr[] = {6,3};
    for(int element : arr){
        set.add(element);
    }
    System.out.println(set);

 }   
}
