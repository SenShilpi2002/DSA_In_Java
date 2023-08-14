import java.util.*;
public class print1ton{
    public static void function(int i,int n){
        if(i>n){
            return;
        }
        System.out.print(i+" ");
        function(i+1,n);
    }
    public static void main(String arg[]){
        System.out.print("The number is : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        function(1,n);
    }
}