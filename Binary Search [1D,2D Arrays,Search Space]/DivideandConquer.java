import java.util.Scanner;


class MinMax{
int min ;
int max ;

MinMax(int min ,int max){
this.min = min;
this.max = max;
}
}


class DivandConquer{

public static MinMax dividenconquer(int arr[] ,int low , int high){

int n = arr.length;

//1 element is present
if(low == high){
return new MinMax(arr[low] , arr[high]);
}

//2 elements are present
if(high == low+1){
if(arr[low] < arr[high]){
return new MinMax(arr[low] , arr[high]);
}
else{
return new MinMax(arr[high] , arr[low]);
}
}

//more than two elements are present
int mid = (low + high)/2;
System.out.println("Mid : " + arr[mid]);

System.out.print("Left Side : ");
for(int i =low;i<=mid;i++){
    System.out.print(arr[i] + " ");
    }
    
    System.out.println();

System.out.print("Right Side : ");
for(int i =mid+1;i<=high;i++){
System.out.print(arr[i] + " ");
}
System.out.println();

MinMax left_result = dividenconquer(arr ,low ,mid);
MinMax right_result = dividenconquer(arr , mid+1 , high);




int min = Math.min(left_result.min , right_result.min);
int max = Math.max(left_result.max , right_result.max);

return new MinMax(min,max);

}
public static void main (String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the total number of elements present in array : ");
int n = sc.nextInt();
int low = 0;
int high = n-1;
int arr[] = new int [n];
System.out.println("Enter the array : ");
for(int i =0;i<n;i++){
arr[i] = sc.nextInt();
}

MinMax result = dividenconquer(arr , low , high);
System.out.println("Minimum Element : " +  result.min);
System.out.println("Maximum Element : " +  result.max);


}
}
