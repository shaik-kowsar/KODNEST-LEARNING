package com.kodnest.method.calculator;
import java.util.Scanner;
public class TaxCalulator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the purchase amount : ");
		double purchase=scan.nextDouble();
		System.out.println("Enter the tax rate: ");
		double taxrate=scan.nextDouble();
		double total=calculateTotalwithTax(purchase,taxrate);
		System.out.println("Total cost including tax is"+total);
		// TODO Auto-generated method stub

	}
	public static double calculateTotalwithTax(double purchaseAmount,double taxRate) {
		return purchaseAmount*taxRate+purchaseAmount;
	}

}
