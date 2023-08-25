package com.kodnest.conversion;
import java.util.Scanner;
public class TemperatureConversion {

	public static void main(String[] args) {
		System.out.println("Welcome to the conversion Tool!");
		Scanner scan=new Scanner(System.in);
		System.out.println("Select an option: \n"+"1.Convert Celisus to Fahrenheit\n" + "2.Convert Fahrenheit to Celisus");
		System.out.println("Enter your choice : ");
		int ch=scan.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter the temperature in Celsius : ");
			break;
		case 2:
			System.out.println("Enter the temperature in Fahrenheit : ");
			break;
		default:
			System.out.println("Error");
		}
		double celsius=scan.nextDouble();
		double res=celsiusToFahrenheit(celsius);
		System.out.println(celsius+"C is equivalent to "+res+"F");
		double fahrenheit=scan.nextDouble();
		double res1=fahrenheitToCelsius(fahrenheit);
		System.out.println(fahrenheit+"F is equivalent to "+res1+"C");
	}
	public static double celsiusToFahrenheit(double celsius) {
		return (celsius*9/5)+32;
		
		}
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit-32)*5/9;
		}

}
