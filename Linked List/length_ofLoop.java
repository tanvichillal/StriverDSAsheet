import java.util.Scanner;

public class length_ofLoop {
    /*Length of loop 
     * first i will detect weather it is a loop or not then i will see the starting node of loop then we can see the   point at which slow fast colllides and the strting 
     * point differnce and with that add how much elements are between the the teo next ]
     */

    public  Node soln(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow= head;
                while(slow !=fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    }
}
