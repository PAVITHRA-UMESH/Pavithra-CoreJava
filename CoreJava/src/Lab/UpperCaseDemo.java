package Lab;

import java.io.*;

public class UpperCaseDemo
{
public static void main(String args[]) throws Exception
{
         ByteArrayOutputStream f = new ByteArrayOutputStream(12);
         System.out.println ("Enter only 5 Characters : ");

         while (f.size() != 5)
         {
              f.write(System.in.read( ) );
         }
        
         byte b[] = f.toByteArray();

        System.out.println("Displaying Characters in the Array");
        for(int l=0;l<b.length;l++)
        {
           System.out.println((char)b[l]);
        }
        ByteArrayInputStream inp = new ByteArrayInputStream(b);
        int c;
        System.out.println("Converted into UpperCase");
        for (int i=0;i<1;i++)
        {
         while((c=inp.read()) != -1)
        {
              System.out.println(Character.toUpperCase((char)c));
        }
        inp.reset();
}
}
}