import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
	Scanner z=new Scanner(System.in);
	int n,ans=1;
	n=z.nextInt();
	while(n>0)
	{
	    ans=ans*n;
	    n--;
	}
		System.out.print(ans);
	}
}