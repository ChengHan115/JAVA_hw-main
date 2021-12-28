package Ch13;

public class ch13_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12;
		int den[]= {12,0,3,0,0,4};
		
		for (int i=0;i<10;i++)
		{
			if (den[i]==0||den.length<i) {
				System.out.println("程式執行有誤");
				break;
			}
			else {
				System.out.println("ans="+num/den[i]);
			}
		}
	}

}
