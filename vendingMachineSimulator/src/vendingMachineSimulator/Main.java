package vendingMachineSimulator;
import java.util.Scanner;
public class Main {
	public static void getProduct(String ProductCode)
	{
		switch(ProductCode) {
		case "P01":
			System.out.println("coco cola");
			break;
		case "P02":
			System.out.println("Pepsi");
			break;
		case "P03":
			System.out.println("Fanta");
			break;
		case "P04":
			System.out.println("Jaljeera");
			break;
		case "P05":
			System.out.println("Mountain Dew");
			break;
		case "P06":
			System.out.println("Boatguava");
			break;
		default:
			System.out.println("Panaka");
		}							
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter product code");
		String productCode =scan.next();
		getProduct(productCode);
		// TODO Auto-generated method stub

	}

}
