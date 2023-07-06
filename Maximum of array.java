import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
Scanner A=new Scanner(System.in);
int n,max=0,i=0;
n=A.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
    a[i]=A.nextInt();
}
for(i=0;i<n;i++)
{
    if(max<a[i])
    max=a[i];
}
System.out.print(max);
    }
}