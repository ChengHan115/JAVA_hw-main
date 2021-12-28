package Ch12;

public class ch12_2_2 {

	   private double pi=3.14;
	   private double radius;

	   public ch12_2_2(double r)      // 定義建構元CCircle()
	   {
	      radius=r;
	   }
	   public void show()
	   {
	       System.out.println("radius="+radius+", area="+pi*radius*radius);
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
