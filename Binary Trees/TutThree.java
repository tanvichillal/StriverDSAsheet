import java.util.Scanner;

public class TutThree {
    static class Main {
        static class Student implements Comparable<Student>{
            String name;
            int prnno ;
            int percentile ;

            public Student(String name , int prnno , int percentile){
                this.name = name;
                this.prnno = prnno;
                this.percentile = percentile;
            }

            @Override
            public int compareTo(Student s2){
                return this.percentile- s2.percentile;
            }

        }

        public static void heapify(Student arr[] , int i , int size){
            int left = 2*i + 1;
            int right = 2*i + 2;

            int minIdx = i;

            if(left < size && arr[left].compareTo(arr[minIdx]) > 0){
                minIdx = left;
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

        public static void heapsort(Student arr[]){
            int n = arr.length;
            for(int i = n/2-1;i>=0;i--){
                heapify(arr, i, n);
            }
            for(int i = n-1;i>0;i--){
                Student temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
                heapify(arr, 0 ,i);

            }
        }

    }

}