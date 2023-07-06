import java. util. Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
       int n, i, j;
       n=z.nextInt();
       int a[]=new int[n];
       for(i=0;i<n;i++) 
       {
           a[i]=z.nextInt() ;
       }
        for(i=0;i<n;i++) 
        System.out.print(a[i]);
    }
}