import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	Scanner z=new Scanner(System.in);
	int n,r=0,sum=0,T=0;
	n=z.nextInt();
	while(n>9)
	{
	     T=n;
	     while(T>0)
	    {
	     r=T%10;
	     sum=sum+r;
	     T=T/10;
	    }
	     n=sum;
	     sum=0;
	}
	System.out.print(n);
	}
}