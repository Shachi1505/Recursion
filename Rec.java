import java.util.*;
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
       // n=10, then 10,5,0,5,10
        Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
       rec(n,n,true);
    }
    public static void rec(int n, int m, boolean flag){
System.out.println(m+ " ");
if(flag==false && n==m) return;
if(flag){
    if((n-m)>0)  rec(n, m-5, true);
    else  rec(n, m-5, false);
} else{
    rec(n, m+5, false);
}
    }
}
