package Ch14;

import java.io.*;
public class ch14_4
{
   public static void main(String args[]) throws IOException
   {
      char data[]=new char[128];
      FileReader fr=new FileReader("D:\\物件導向\\dd.txt");

      int num=fr.read(data);
      String str=new String(data,0,num);
      System.out.println("Characters read= "+num);
      System.out.println(str);

      fr.close();
   }
}
