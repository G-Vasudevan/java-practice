import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
	Scanner z=new Scanner(System.in);
	int n,i,c=1,a=0,b=1;
	n=z.nextInt();
	a=0;
	b=1;
	if (n<=1)
	{
	    System.out.print(n);
	    return;
	}
	for(i=2;i<=n;i++)
	{
	    c=a+b;
	    a=b;
	    b=c;
	}
		System.out.print(c);
	}
}