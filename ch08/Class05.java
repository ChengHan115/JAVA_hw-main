package java08;
public class Class05 {

	public static void main(String[] args) {
		CBox box;
		box = new CBox();	
		box.length = 1;		//(a)
		box.width = 1;
		box.height = 1;
		box.volume();
		box.surfaceArea();
		box.showData();
		box.showAll();
	}
	
}