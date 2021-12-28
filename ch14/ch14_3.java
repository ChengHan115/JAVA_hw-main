package Ch14;

import java.util.Scanner;
public class ch14_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = 0;
		for (int i=1;i<=n;i++)
		{
			b+=i;
		}
		System.out.println(b);
	}

}
