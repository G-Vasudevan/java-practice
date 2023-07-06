import java.util.Scanner;
class Main{
	public static void main(String[] args) {
	Scanner z=new Scanner (System.in);
	int n,r=0,Sum=0,c=0;
	n=z.nextInt();
	while (n>0)
	{
	    r=n%10;
	    Sum=Sum+r;
	    c++;
	    n=n/10;
	}
	System.out.print(c+"\n"+Sum);
	}
}