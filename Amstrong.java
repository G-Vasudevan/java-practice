import java.util.Scanner;
public class Main { 
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int n,c=0,sum=0,f,r,t;
        n=z.nextInt();
        f=n;
        t=n;
        
        while(n>0) //count
        {
            n=n/10;
            c++;
        }
        
        while(t>0) //take every value
        {
            r=t%10;
            sum=sum+(int)(Math.pow(r,c));
            t=t/10;
        }
        if(sum==f)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong number");  
    }
}