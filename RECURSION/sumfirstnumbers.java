/*import java.util.*;
public class sumfirstnumbers{
    static int sum=0;
    public static void function(int i,int n){
        if(i>n){
            return;
        }
        sum=sum+i;
        System.out.print(sum+" " );
        function(i+1,n);
    }
    public static void main(String arg[]){
        System.out.print("The number is : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        function(1,n);
    }
}*/

import java.util.*;
public class sumfirstnumbers{
    public static int function(int i,int sum){
        if(i<1){
            System.out.print(sum);
            return sum;
        }
        return function(i-1,sum+i);
       
    }
    public static void main(String arg[]){
        System.out.print("The number is : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        function(n,0);
    }
}