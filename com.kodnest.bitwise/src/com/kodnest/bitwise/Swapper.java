package com.kodnest.bitwise;
import java.util.Scanner;
public class Swapper {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first integer : ");
		int value1=scan.nextInt();
		System.out.println("Enter the second integer : ");
		int value2=scan.nextInt();
		bitswapper(value1,value2);
	}
	public static void bitswapper(int value1,int value2) {
		int temp= value1^value2;
		value2=value1^temp;
		value1=value2^temp;
		
		System.out.println("After swapping First = "+value2+ " Second = " + value1);
		
		// TODO Auto-generated method stub

	}

}
