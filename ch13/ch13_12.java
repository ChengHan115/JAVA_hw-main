package Ch13;


class NotTriangle extends Exception
{ 
	
}
class EquilateralTriangle extends Exception
{ 
	
}
class NotEquilateralTriangle extends Exception
{ 
	
}
public class ch13_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			triangle(3, 3, 3);
		}
		catch(NotTriangle e)
		{
			System.out.println("���c���T����");
		}
		catch(EquilateralTriangle e)
		{
			System.out.println("�o�O���T����");
		}
		catch(NotEquilateralTriangle e)
		{
			System.out.println("�o���O���T����");
		}
	}
		public static void triangle(int a,int b,int c)throws 
		NotTriangle,EquilateralTriangle,NotEquilateralTriangle
		{
			if ((a+b)<c||(a+c)<b||(b+c)<a)
			{
				throw new NotTriangle();
			}
			else if (a==b && b==c && a==c)
			{
				throw new EquilateralTriangle();
			}
			else
			{
				throw new NotEquilateralTriangle();
			}
		}


	}
