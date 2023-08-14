import java.util.*;
public class printname{
    public static void function(int i,int n){
        if(i>n){
            return;
        }
        System.out.print("SEN"+" ");
        function(i+1,n);
    }
    public static void main(String args[]){
        System.out.print("The number is : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        function(1,n);

    }
}