import STACK.display;

public class quicksort{
    public static void display(int [] arr){

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

    while(){
        arr[i] < pivot
    }


   }







    public static void quickSort(int [] arr , int start , int end){
        if(start >= end){
            return;
        }

        int pi = partition(arr , start , end);
        quickSort(arr, start, pi_1);
        quickSort(arr, pi+1, end);

    }
    public static void main(String arg[]){
        int [] arr = {9,3,2,8,5,7,1}
        int n = arr.length;
        System.out.println("Before Sorting the array ");
        display(arr);
        System.out.println();
        System.out.println("After sorting the array ");
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
