package java09;

public class CCout {
	private static int n;
	private static int cnt=0;
	public CCout() {
		
	}
	public void count()  //(e)�n�ŧi���O���    
	{
	      cnt++;                   //(a)
	    //(d) ���ӧQ�����O���; �]����Q�ܼƥ������إߪ���A�A�Q�Ϊ���өI�s�����
	}
	public void setZero() {
		cnt=0;		//(b)
		
	}
	public void setValue() {
		cnt=n;			//(c)
	}
}
