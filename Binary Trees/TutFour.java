import java.util.Scanner;

class MinMax{
    int min;
    int max;
    MinMax(int min ,int max){
        this.min = min;
        this.max = max;
    }
}

public class TutFour {
    public static MinMax dnc(int arr[] , int low , int high)
    int n = arr.length;

    if(low == high){
        return MinMax(arr[low] , arr[high]);
    }

    if(high == low +1){
        if(arr[low] < arr[high]){
            return new MinMax(arr[low], arr[high]);
        } 
        else {
            return new MinMax(arr[high], arr[low]);
        }
    }

    int mid = (low + high)/2;
    System.out.println("MId : " + arr[mid]);
    System.out.println("Left Side : ");
    for(int i =low;i<=mid;i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();

    System.out.println("Right Side : ");
    for(int i = mid+1;i<=high;i++)[
        System.out.println(arr[i] + " ");
    ]
    
    MinMax leftresult = dnc(arr, low, mid);
    MinMax rightresult = dnc(arr, mid+1, high);

    int min = Math.min(leftresult.min , rightresult.min);
    int max = Math.min(leftresult.max , rightresult.max);

    return new MinMax(min, max);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           

}

