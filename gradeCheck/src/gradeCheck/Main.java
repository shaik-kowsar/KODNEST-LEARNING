package gradeCheck;
import java.util.Scanner;
public class Main {
	public static void checkGrade(int grade) {
		if(grade>50) {
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
		}
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter grade");
		int grade=scan.nextInt();
		checkGrade(grade);
			
		// TODO Auto-generated method stub

	}

}
