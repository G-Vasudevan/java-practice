import java.util.Scanner;
class Main{
	public static void main(String[] args) {
	Scanner z=new Scanner (System.in);
	int n,answer=1,i,p;
	n=z.nextInt();
	p=z.nextInt();
	i=1;
	while(i<=p)
	{
	  answer=answer*n;
	  i++;
	}
	System.out.print(answer);
}
}