package com.kodnest.logicaloperator;
import java.util.Scanner;
public class LogicalOperatorValidator {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Is input valid(true/false):");
	boolean m=scan.nextBoolean();
	System.out.println("Does input meet a certain condition(true/false):");
	boolean n=scan.nextBoolean();
    isValidInput(m,n);
	}
	public static void isValidInput(boolean m,boolean n) {
		if(m&&n) {
			System.out.println("Input is Valid");
		}
		else {
			System.out.println("It is Invalid");
			}
		
		
	}

}

