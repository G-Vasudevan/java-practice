import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
     Scanner read=new Scanner (System.in);
     int x=read.nextInt();
      int result=0;
     for(int i=1;i<=x;i++){
         result=result+i;
    }
       System.out.print(result);
   }
}