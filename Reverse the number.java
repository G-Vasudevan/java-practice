import java.util.Scanner;
class Main{
	public static void main(String[] args) {
	Scanner z=new Scanner (System.in);
	int n,answer=0,r=0;
	n=z.nextInt();
	while (n>0)
	{
	    r=n%10;
	    answer=answer*10+r;
	    n=n/10;
	}
	System.out.print(answer);
	}
}