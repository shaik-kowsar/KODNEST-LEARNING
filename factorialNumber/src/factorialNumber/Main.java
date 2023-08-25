package factorialNumber;
import java.util.Scanner;
public class Main {
	public static void calculateFactorial(int n) {
		int sum=1;
		for(int i=1;i<=n;i++) {
			sum=sum*i;
		}
		System.out.println(sum);
		
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		calculateFactorial(n);
		
		// TODO Auto-generated method stub

	}

}
