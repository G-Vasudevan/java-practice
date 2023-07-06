import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner hari=new Scanner (System.in);
        int a,b,c;
        a=hari.nextInt();
        b=hari.nextInt();
        c=hari.nextInt();
        if (a>=b)
       {
            if (a>=c)
              System.out.print(a);
            else
              System.out.print(c);
       }
        else
        {
          if (b>=c)
              System.out.print(b);
            else
                System.out.print(c);
          }  
    }
}