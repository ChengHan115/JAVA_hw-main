package Ch10;

class Caaa
{
    private int num;
    public Caaa(int n)
    {
        num=n;
    }
    public int get()
    {
        return num;
    }
}
class Cbbb extends Caaa
{
    public Cbbb()
    {
        super(2);
    }
    public void show()
    {
        System.out.println("num="+get());
    }
}
public class ch10_5
{
    public static void main(String[] args)
    {
        Cbbb bb=new Cbbb();    //(c)子類別的display會被呼叫
        bb.show();
    }
}