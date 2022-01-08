package ch15;

class CTest extends Thread
{
   private String id;
   public CTest(String str)
   {
      id=str;		//(a)
   }
   public void run()		//(b)
   {
      for(int i=1;i<=5;i++)
      {
         for(int j=0;j<100000000;j++);
         System.out.println(id+" "+i);
      }
   }
}

public class ch15_2
{
   public static void main(String args[])
   {
      CTest hi=new CTest("Hello");		//(c)
      CTest bye=new CTest("Good bye");
      hi.run();
      bye.run();
   }
}