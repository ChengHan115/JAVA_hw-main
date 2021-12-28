package java09;

public class CCout {
	private static int n;
	private static int cnt=0;
	public CCout() {
		
	}
	public void count()  //(e)要宣告類別函數    
	{
	      cnt++;                   //(a)
	    //(d) 應該利用類別函數; 因為實利變數必須先建立物件，再利用物件來呼叫的函數
	}
	public void setZero() {
		cnt=0;		//(b)
		
	}
	public void setValue() {
		cnt=n;			//(c)
	}
}
