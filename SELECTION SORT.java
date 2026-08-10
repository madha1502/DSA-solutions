import java.util.*;
class Main{
    public static void main(String args[]){
        int arr[] = {8,6,5,4,7,2,3,1};
        selectionSort(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i]=temp;
        }
    }
}
