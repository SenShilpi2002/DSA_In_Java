import java.util.*;

public class quicksort{
    public static void display(int [] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void swap(int [] arr , int start , int pivotIndx){

    }

   public static int partition(int [] arr , int start , int end){
    int pivot = arr[start];

    int count = 0;
    for(int i=1 ; i<=end ; i++){
        if(arr[i] <= pivot){
            count++;
        }
    }

    int pivotIdx = start + count;
    swap(arr , start , pivot);

    int i = start;
    int j = end;
    while(i < pivotIdx && j > pivotIdx){
       if(arr[i] <= pivotIdx){
        i++;
       }

       if(arr[j] >= pivotIdx){
        j--;
       }

       if(i < pivotIdx && j > pivotIdx){
        swap(arr, i, j);
        i++;
        j--;
       }
    }
    return pivotIdx;

   }



    public static void quickSort(int [] arr , int start , int end){
        if(start >= end){
            return;
        }

        int pi = partition(arr , start , end);
        quickSort(arr, start, pi-1);
        quickSort(arr, pi+1, end);

    }


    public static void main(String arg[]){
        int [] arr = {9,3,2,8,5,7,1};
        //int n = arr.length;
        System.out.print("Before Sorting the array ");
        display(arr);
        System.out.println();
        quickSort(arr, 0, arr.length-1);
        System.out.print("After sorting the array ");
        display(arr);
    }
}


/* 
// quickSort(arr,start,end){
 * L1....pivot = partition(arr , start , end);
 * L2....quicksort(arr , start , pivot-1);
 * L3....quicksort(arr , pivot+1 , end);
}
*/
