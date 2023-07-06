import java.util.Scanner;
class Main{
	public static void main(String[] args) {
	Scanner z=new Scanner (System.in);
	int n,answer=1,i,p;
	n=z.nextInt();
	p=z.nextInt();
	for(i=1;i<=p;i++)
	{
	  answer=answer*n;
	}
	System.out.print(answer);
}
}