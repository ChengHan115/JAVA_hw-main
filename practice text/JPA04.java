package TQC;


import java.util.Scanner;
public class JPA04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Input n (0<=n<=16):");
			int a = sc.nextInt();
			int b = 1;
			for (int i=1;i<=a;i++) {
				b*=i;
			}
			System.out.println(a+" ªº¶¥­¼ = "+b);
		}
	}
		
	}
