import java.util.*;
public class mergesort{

    public static void conquer(int arr[],int si,int mid,int ei){
        int merge[]=new int[ei-si+1];
        int index1=si;
        int index2=mid+1;
        int x=0;
        while(index1<=mid && index2<=ei){
            if(arr[index1]<=arr[index2]){
                merge[x]=arr[index1];
                x++;
                index1++;
            }
            else{
                merge[x]=arr[index2];
                x++;
                index2++;
            }
        }
        while(index1<=mid){
            merge[x++]=arr[index1++];
        }
        while(index2<=ei){
            merge[x++]=arr[index2++];
        }
        for(int i=0,j=si;i<merge.length;i++,j++){
            arr[j]=merge[i];
        }
    }
    public static void divide(int arr[],int si,int ei){
        int mid=si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n=nextInt();
        System.out.println("enter the array elements ");
        divide(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.println();
        }
    System.out.println();
    }
}