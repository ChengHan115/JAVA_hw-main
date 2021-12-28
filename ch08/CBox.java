package java08;

public class CBox {
	int length;
	int width;
	int height;
	public int  volume()	//(b)
	{
		return width*height*length;
	}
	public int surfaceArea()	//(c)
	{
		return length*width*6;
	}
	public void showData()	//(d)
	{
		System.out.println("length="+length+",width="+width+",height="+height);
	}
	public void showAll()	//(e)
	{
		System.out.println("length="+length+",width="+width+",height="+height);
		System.out.println("ªí­±¿n="+surfaceArea());
		System.out.println("Åé¿n="+volume());
	}
}
