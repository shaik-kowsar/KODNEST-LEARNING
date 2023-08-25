package fibonacciSeries;
import java.util.Scanner;
public class Main {
	public static void printFibonacciSeries(int n) {
		int fib1=0;
		int fib2=1;
		if(n==0) {
			System.out.println(fib1);
		}
		else if(n==1) {
			System.out.println(fib1+" "+fib2);
		}
		else {
			System.out.print(fib1+" "+fib2);
			for(int i=3;i<n;i++) {
				int nextfib=fib1+fib2;
				System.out.print(" "+nextfib);
				fib1=fib2;
				fib2=nextfib;
				}
			
		}
		
		
		}
		
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=scan.nextInt();
		printFibonacciSeries(n);
		
		// TODO Auto-generated method stub

	}

}
