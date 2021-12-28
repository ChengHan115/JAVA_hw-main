package java08;

public class CTest {
	public void test(int x)
    {
        if(x%2==0 && x!=0)
        {
            System.out.println("计案计");
        }
        else if(x==0)
        {
            System.out.println("计0");
        }
        else
        {
            System.out.println("计计");
        }
    }
}
