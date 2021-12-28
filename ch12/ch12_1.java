package Ch12;


public class ch12_1
{
   public static void main(String args[])
   {
	   ch12_1_1 rect1;
      rect1=new ch12_1_1(); // 建立新的物件

      rect1.width=20;      // 設定矩形rect1的寬
      rect1.height=15;     // 設定矩形rect1的高

      System.out.println("width="+rect1.width);    // 印出rect1.width
      System.out.println("height="+rect1.height);    // 印出rect1.height
   }
}