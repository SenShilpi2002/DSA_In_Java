import java.util.*;
public class printnto1{
    public static void function(int i,int n){
        if(i<1){
            return;
        }
        System.out.print(i+" ");
        function(i-1,n);
    }
    public static void main(String arg[]){
        System.out.print("The number is : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        function(n,n);
    }
}