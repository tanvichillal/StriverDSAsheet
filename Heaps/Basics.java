import java.util.Scanner;

public class Solution {

    public static void heapify(StudentData studentsArray[] , int n , int i ){
        int largest = i;
        int left = 2 * i + 1 ;
        int right = 2 * i + 2;

        if(left < n && studentsArray[left].cgpa > studentsArray[largest].cgpa){
            largest = left;
        }
        if(right < n && studentsArray[right].cgpa > studentsArray[largest].cgpa){
            largest = right;
        }

        if(largest != i){
            StudentData temp = studentsArray[i];
            studentsArray[i] = studentsArray[largest] ;
            studentsArray[largest] = temp;
        }

        heapify(studentsArray, n, largest);
    }

    public static class StudentData {
        String name;
        int prnno;
        int cgpa;

        StudentData(String name, int prnno, int cgpa) {
            this.name = name;
            this.prnno = prnno;
            this.cgpa = cgpa;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of students : ");
        int n = sc.nextInt();
        sc.nextLine(); 
        StudentData[] studentsArray = new StudentData[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Name of Student " + (i + 1) + ": ");
            String Name = sc.nextLine();
            System.out.println("Enter PRN No. of Student " + (i + 1) + ": ");
            int prn_no = sc.nextInt();
            System.out.println("Enter CGPA of Student " + (i + 1) + ": ");
            int cgpa = sc.nextInt();
            sc.nextLine(); 
            studentsArray[i] = new StudentData(Name, prn_no, cgpa);
        }

        System.out.println("\nStudent Data:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": " + studentsArray[i].name + ", PRN No: " + studentsArray[i].prnno + ", CGPA: " + studentsArray[i].cgpa);
        }
    }
}
