package java08;
class CWin
{
    int width;
    int heigh;
    String name;
    void setW(int w)
    {
        width=w;		//(a)
    }
    void setH(int h)
    {
        heigh=h;
    }
    void setName(String s)
    {
        name=s;
    }
    void show()
    {
        System.out.println("Name="+this.name);
        System.out.println("W="+this.width+","+"H="+this.heigh);
    }
    void setWindows(int w,int h)		//(b)
    {
        this.width=w;
        this.heigh=h;
    }
    void setWindows(int w,int h,String s)		//(c)
    {
        this.width=w;
        this.heigh=h;
        this.name=s;
    }
}
public class Class12
{
    public static void main(String[] args)
    {
        CWin cw=new CWin();
        cw.setName("lst Windows");
        cw.setW(5);
        cw.setH(3);
        cw.show();
    }
}