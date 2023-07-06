import java.util.*;
import static java.lang.Math.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner z=new Scanner(System.in);
		int a,b,c=0,i=1,j;
		a=z.nextInt();
		b=z.nextInt();
		for(i=a;i<=b;i++)
		{
		    c=0;
		for(j=2;j<=Math.sqrt(i);j++)
		{
		if(i%j==0)
		{
		    c=1;
		    break;
		}
		}
		if(c==0)
		System.out.println(i);
}
}
}