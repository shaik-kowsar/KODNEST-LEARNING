package com.kodnest.conditionalconstructs;
import java.util.Scanner;
public class MultipleofTenChecker {
	public static void checkMultipleOfTen(int n)
	{
	if(n%10==0) {
		System.out.println("The number is a multiple of 10");

	}
	else {
		System.out.println("The number  is not a multiple of 10");
	}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an integer");
		int num=scan.nextInt();
		checkMultipleOfTen(num);
		
		
		// TODO Auto-generated method stub

	}

}
