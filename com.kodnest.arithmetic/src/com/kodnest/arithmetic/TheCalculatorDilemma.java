package com.kodnest.arithmetic;
import java.util.Scanner;
public class TheCalculatorDilemma {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("Enter your choice : ");
		int res=scan.nextInt();
		Calculator(num1,num2,res);
		// TODO Auto-generated method stub

	}
	public static void Calculator(int num1,int num2,int res) {
		switch(res) {
		case 1:
			res=num1+num2;
			System.out.println("Addition result is "+res);
			break;
		case 2:
			res=num1-num2;
			System.out.println("Subtraction result is "+res);
			break;
		case 3:
			res=num1*num2;
			System.out.println("Multiplication result is "+res);
			break;
		case 4:
			res=num1/num2;
			System.out.println("Division result is "+res);
			break;
		default:
			System.out.println("Your code is not coorect");
		
		}
	}

}
