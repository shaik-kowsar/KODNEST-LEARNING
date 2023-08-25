package gcd;
import java.util.Scanner;
public class Main {
	public static void findGCD(int a,int b) {
		int rem,GCD;
		while(b!=0) {
			rem=a%b;
			a=b;
			b=rem;
			
		}
	 GCD=a;
		System.out.println(GCD);
		
		
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two  numbers ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		findGCD(a,b);
		// TODO Auto-generated method stub

	}

}
