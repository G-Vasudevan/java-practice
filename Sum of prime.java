import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner z=new Scanner(System.in);
		int a,sum=0,r=0,c,j=2;
		a=z.nextInt();
		while(a>0)
		{
		r=a%10;
		c=0;
		for(j=2;j<=Math.sqrt(r);j++)
		{
		if(r%j==0)
		{
		    c=1;
		    break;
		}
		}
		if(c==0)
		sum=sum+r;
		a=a/10;
}
System.out.print(sum);
}
}