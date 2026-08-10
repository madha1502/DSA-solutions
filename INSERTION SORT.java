import java.util.*;
class Main{
    public static void main(String args[]){
        int arr[] = {8,6,5,4,7,2,3,1};
        insertionSort(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int min = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>min){
                arr[j+1] = arr[j];
                arr[j]=min;
                j--;
            }
        }
    }
}
