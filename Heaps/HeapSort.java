import java.util.Scanner;

public class HeapSort {

    static class Student implements Comparable<Student>{
        String name;
        int prn_no;
        int percentile;

        public Student(String name , int prn_no , int percentile){
            this.name = name;
            this.prn_no = prn_no;
            this.percentile = percentile;
        }

        @Override
        public int compareTo(Student s2){
            return this.percentile - s2.percentile;
        }
    }

    public static void heapify(Student arr[] ,int i , int size){
        int left = 2 * i+1;
        int right =  2* i+2;
        int minIdx = i;

        if(left <size && arr[left].compareTo(arr[minIdx]) >0){
            minIdx =left;
        }
        if(right < size && arr[right].compareTo(arr[minIdx]) >0){
            minIdx = right;
        }
        if(minIdx != i){
            Student temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
            heapify(arr, minIdx, size);
        }
    }

    public static void  heapsort(Student arr[]){
        //1st step : Max Heap
        int n = arr.length;
        for(int i=n/2-1;i>=0;i--){

            //for which index you are doing heapify    2nd for the size of heap
            heapify(arr ,i,n);

        }

        //2nd step : Push largest at end
        for(int i =n-1;i>0;i--){
            //swapping largest with the last index 
            Student temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,0,i);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of students : ");
        int no_Stud = sc.nextInt();
        Student[] students = new Student[no_Stud] ;
        for(int i=0;i<no_Stud;i++){
            System.out.println("PRN of Student "+(i+1));
            int prn_no = sc.nextInt();
            System.out.println("CGPA of Student "+(i+1));
            int percentile = sc.nextInt();
            sc.nextLine();
            System.out.println("Name of Student "+(i+1));
            String name = sc.nextLine();
       
            students[i] = new Student(name, prn_no, percentile);
        }
        heapsort(students);
        System.out.println("The intership will be offered to " + students[0].name + " whose percentile is : " + students[0].percentile);
        System.out.println();
        System.out.println("Sorting students in ascending order of grades");
        for(int i =0;i<students.length;i++){
            System.out.println("Name : " + students[i].name );
            System.out.println("PRN No. : " + students[i].prn_no) ;
            System.out.println("Percentile : " + students[i].percentile );
            
        }
    }
}
