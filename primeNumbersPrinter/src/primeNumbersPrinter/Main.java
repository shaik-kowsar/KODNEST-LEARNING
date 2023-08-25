package primeNumbersPrinter;
import java.util.Scanner;
public class Main {
	public static void printPrimes(int n) {
		int count=0;
		for(int i=3;count<n;i++) {
			boolean res=checkPrime(i);
			if(res==true) {
				System.out.print(i+" ");
				count++;
			}
		}
		
		
	}
	public static boolean checkPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%2==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("START");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		printPrimes(n);
		System.out.println("END");
		// TODO Auto-generated method stub

	}

}
